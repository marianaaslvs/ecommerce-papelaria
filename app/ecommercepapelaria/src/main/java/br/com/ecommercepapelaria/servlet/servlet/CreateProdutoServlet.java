package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.ProdutoDao;
import br.com.ecommercepapelaria.servlet.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    @WebServlet ("/criar-produto")

    public class CreateProdutoServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("/produto.html").forward(req, resp);
        }


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String idProduto = req.getParameter("idProduto");
        String nomeProduto = req.getParameter("nome-produto");
        String descricao = req.getParameter("descricao");
        double preco = Double.parseDouble(req.getParameter("preco"));

        Produto prod = new Produto(idProduto, nomeProduto, descricao, preco);


        ProdutoDao ProdutoDao = new ProdutoDao();
        ProdutoDao.createProduto(prod);

        resp.sendRedirect("/find-all-produtos");

    }

    }
