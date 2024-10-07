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


       @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String idCliente = req.getParameter("idCliente");
            String idProduto = req.getParameter("idCarrinho");


            Carrinho carrinho = new Carrinho();

            carrinho.setIdCliente(idCliente);
            carrinho.setIdProduto(idProduto);


            CarrinhoDao carrinhoDao = new CarrinhoDao();
            carrinhoDao.createCarrinho(carrinho);

            req.getRequestDispatcher("index.html").forward(req, resp);

        }
}
