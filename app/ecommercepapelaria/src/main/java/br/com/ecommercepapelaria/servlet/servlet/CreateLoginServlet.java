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
public class CreateLoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.html").forward(req, resp);
    }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cpf = req.getParameter("cpf");
        String senha = req.getParameter("senha");

        LoginDao loginDao = new LoginDao();
        Login login = new Login(cpf,senha);

        //loginDao.createLogin(login);

        if(null==cpf|| cpf.equals("")){
            loginDao.createLogin(login);
        } else{
            loginDao.updateLogin(login);
        }




         req.getRequestDispatcher("/find-all-login");

    }

    }


