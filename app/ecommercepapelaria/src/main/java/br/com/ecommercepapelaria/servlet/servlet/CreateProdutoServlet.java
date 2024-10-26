package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.ProdutoDao;
import br.com.ecommercepapelaria.servlet.model.Produto;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent;

@WebServlet ("/criar-produto")

    public class CreateProdutoServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("/produtos.jsp").forward(req, resp);
        }


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

            Map<String, String> parameters = uploadImage(req);

            String idProduto = parameters.get("idProduto");
            String nomeProduto = parameters.get("nomeProduto");
            String descricao = parameters.get("descricao");
            double preco = Double.parseDouble(parameters.get("preco"));
            String produtoImagePath = parameters.get("image");

            ProdutoDao produtoDao = new ProdutoDao();
            Produto produto = new Produto(idProduto, nomeProduto, descricao, preco, produtoImagePath);


                if(null == idProduto || idProduto.equals("")){
                    produtoDao.createProduto(produto);
                }
                else {
                    produtoDao.updateProduto(produto);
                }

            resp.sendRedirect("/find-all-produtos");

    }



        private Map<String, String> uploadImage(HttpServletRequest httpServletRequest) {

            Map<String, String> requestParameters = new HashMap<>();

            if (isMultipartContent(httpServletRequest)) {

                try {

                    DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

                    List<FileItem> fileItems = new ServletFileUpload(diskFileItemFactory).parseRequest(httpServletRequest);

                    for (FileItem fileItem : fileItems) {

                        checkFieldType(fileItem, requestParameters);

                    }

                } catch (Exception ex) {

                    requestParameters.put("image", "img/default-car.jpg");

                }

            }

            return requestParameters;

        }

        private void checkFieldType(FileItem item, Map requestParameters) throws Exception {

            if (item.isFormField()) {

                 requestParameters.put(item.getFieldName(), item.getString());

             } else {

                String fileName = processUploadedFile(item);
                requestParameters.put("image", "img/".concat(fileName));

            }

        }

        private String processUploadedFile(FileItem fileItem) throws Exception {
            Long currentTime = new Date().getTime();
            String fileName = currentTime.toString().concat("-").concat(fileItem.getName().replace(" ", ""));
            String filePath = this.getServletContext().getRealPath("img").concat(File.separator).concat(fileName);
            fileItem.write(new File(filePath));
            return fileName;
        }

    }
