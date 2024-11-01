package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.FaleConoscoDao;
import br.com.ecommercepapelaria.servlet.model.FaleConosco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/fale-conosco")
public class CreateFaleConoscoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/faleConoscoP.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String idDuvida = req.getParameter("idDuvida");
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String duvida = req.getParameter("duvida");
        String status = req.getParameter("status");

        FaleConoscoDao faleConoscoDao = new FaleConoscoDao();
        FaleConosco faleConosco = new FaleConosco(idDuvida, nome, email, duvida,status);

        if(null == idDuvida || idDuvida.equals("")){
            faleConoscoDao.criarCriarFaleConosco(faleConosco);
        }
        else {
            faleConoscoDao.updateFaleConosco(faleConosco);
        }

        resp.sendRedirect("/find-all-duvidas");

    }

}
