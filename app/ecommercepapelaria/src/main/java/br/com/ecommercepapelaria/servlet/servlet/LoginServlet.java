package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.ClienteDao;
import br.com.ecommercepapelaria.servlet.dao.UserDao;
import br.com.ecommercepapelaria.servlet.model.Cliente;
import br.com.ecommercepapelaria.servlet.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
 }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cpf = req.getParameter("cpf");
        String senha = req.getParameter("senha");

       Cliente cliente = new Cliente(cpf, senha);

        boolean isValidUser = new ClienteDao().verifyCredentials(cliente);

        if (isValidUser) {

            req.getSession().setAttribute("loggedUser", cpf);

            resp.sendRedirect("/find-all-produtos");

        } else {

            req.setAttribute("message", "Invalid credentials!");

            req.getRequestDispatcher("login.jsp").forward(req, resp);

        }

    }



}
