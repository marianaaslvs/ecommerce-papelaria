package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.ProdutoDao;
import br.com.ecommercepapelaria.servlet.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-produtos")
public class ListProdutoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProdutoDao produtoDao = new ProdutoDao();

        List<Produto> allProdutos = produtoDao.findAllProdutos();

        req.setAttribute("produtos", allProdutos);

        req.getRequestDispatcher("/produto.jsp").forward(req, resp);

    }
}
