package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.CarrinhoDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete-carrinho")
public class DeleteCarrinhoServlet extends HttpServlet{

    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

            String idCarrinho = req.getParameter("idCarrinho");

            new CarrinhoDao().deleteCarrinho(idCarrinho);

            resp.sendRedirect("/find-all-carrinho");

        }


    }
