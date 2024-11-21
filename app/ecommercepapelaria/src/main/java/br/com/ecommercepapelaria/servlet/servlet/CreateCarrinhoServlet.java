package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.CarrinhoDao;
import br.com.ecommercepapelaria.servlet.model.Carrinho;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/criar-carrinho")
public class CreateCarrinhoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/carrinhos.jsp").forward(req, resp);
    }




    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String idCarrinho = req.getParameter("idCarrinho");
            String idCliente = req.getParameter("idCliente");
            String idProduto = req.getParameter("idProduto");
            int quantidade = Integer.parseInt(req.getParameter("quantidade"));


            CarrinhoDao carrinhoDao = new CarrinhoDao();
            Carrinho carrinho = new Carrinho(idCarrinho,idCliente, idProduto,quantidade);




        if(null == idCarrinho || idCarrinho.equals("")){
            carrinhoDao.createCarrinho(carrinho);
        }
        else {
            carrinhoDao.updateCarrinho(carrinho);
        }
        resp.sendRedirect("/find-all-carrinho");

       }
}
