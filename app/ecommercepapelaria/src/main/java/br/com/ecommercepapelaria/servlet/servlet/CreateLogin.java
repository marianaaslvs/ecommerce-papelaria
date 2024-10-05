package br.com.ecommercepapelaria.servlet.servlet;


import br.com.ecommercepapelaria.servlet.dao.LoginDao;
import br.com.ecommercepapelaria.servlet.model.Login;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/criar-login")
public class CreateLogin  extends HttpServlet{

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String cpf = req.getParameter("cpf");
            String senha = req.getParameter("senha");


            Login login = new Login();

            login.setCpf(cpf);
            login.setSenha(senha);


            LoginDao loginDao = new LoginDao();
            loginDao.createLogin(login);

            req.getRequestDispatcher("index.html").forward(req, resp);

        }

    }


