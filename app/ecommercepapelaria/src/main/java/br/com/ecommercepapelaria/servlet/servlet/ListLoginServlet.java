package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.LoginDao;
import br.com.ecommercepapelaria.servlet.model.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-login")
public class ListLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginDao loginDao = new LoginDao();

        List<Login> allLogin = loginDao.findAllLogin();

        req.setAttribute("login", allLogin);


        req.getRequestDispatcher("/login.jsp").forward(req, resp);


    }

}
