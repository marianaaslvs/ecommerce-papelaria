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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String idProduto = req.getParameter("idProduto");
        String descricao = req.getParameter("descricao");
        String preco = req.getParameter("preco");

        Produto prod = new Produto();

        prod.setIdProduto(idProduto);
        prod.setDescricao(descricao);
        prod.setPreco(preco);

        ProdutoDao ProdutoDao = new ProdutoDao();
        ProdutoDao.createProduto(prod);

        req.getRequestDispatcher("index.html").forward(req, resp);

    }

    }
