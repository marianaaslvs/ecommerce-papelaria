package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.FaleConoscoDao;
import br.com.ecommercepapelaria.servlet.dao.ProdutoDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-fale-conosco")
public class DeleteFaleConoscoServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String idDuvida = req.getParameter("idDuvida");

        new FaleConoscoDao().deleteDuvida(idDuvida);

        resp.sendRedirect("/find-all-duvidas");

    }


}
