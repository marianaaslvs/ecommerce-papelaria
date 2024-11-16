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
        req.getRequestDispatcher("/carrinho.html").forward(req, resp);
    }




    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String idCliente = req.getParameter("idCliente");
            String idProduto = req.getParameter("idProduto");


            Carrinho carrinho = new Carrinho(idCliente, idProduto);



            CarrinhoDao carrinhoDao = new CarrinhoDao();
            carrinhoDao.createCarrinho(carrinho);

           // req.getRequestDispatcher("index.jsp").forward(req, resp);
        //req.getRequestDispatcher("/find-all-login");
        resp.sendRedirect("/find-all-login");
        }
}
