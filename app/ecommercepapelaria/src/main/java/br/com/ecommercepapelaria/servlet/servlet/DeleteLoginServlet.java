package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.LoginDao;
import br.com.ecommercepapelaria.servlet.dao.MetodoPagamentoDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet ("/delete-login")
public class DeleteLoginServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String cpf = req.getParameter("cpf");

        new LoginDao().deleteLogin(cpf);

        resp.sendRedirect("/find-all-login");

    }


}
