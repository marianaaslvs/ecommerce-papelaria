package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.CarrinhoDao;
import br.com.ecommercepapelaria.servlet.model.Carrinho;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/find-all-carrinho")
public class ListCarrinhoServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CarrinhoDao carrinhoDao = new CarrinhoDao();

        List<Carrinho> allCarrinho = carrinhoDao.findAllCarrinho();

        req.setAttribute("carrinho", allCarrinho);

        req.getRequestDispatcher("/carrinho.jsp").forward(req, resp);

    }


}
