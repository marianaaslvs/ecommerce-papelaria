package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.FaleConoscoDao;
import br.com.ecommercepapelaria.servlet.dao.MetodoPagamentoDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/delete-metodoPagamento")
public class DeleteMetodoPagamento extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String idMetodoPagamento = req.getParameter("idMetodoPagamento");

        new MetodoPagamentoDao().deleteMetodoPagamento(idMetodoPagamento);

        resp.sendRedirect("/find-all-metodoPagamento");

    }


}
