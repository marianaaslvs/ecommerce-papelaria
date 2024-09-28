package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.ClienteDao;
import br.com.ecommercepapelaria.servlet.dao.FaleConoscoDao;
import br.com.ecommercepapelaria.servlet.model.Cliente;
import br.com.ecommercepapelaria.servlet.model.FaleConosco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/criar-Fale Conosco")
public class CreateFaleConoscoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String duvida = req.getParameter("duvida");

        FaleConosco FaleConosco = new FaleConosco();
        FaleConosco.setNome(nome);
        FaleConosco.setEmail(email);
        FaleConosco.setDuvida(duvida);

        FaleConoscoDao FaleConoscoDao = new FaleConoscoDao();
        FaleConoscoDao.criarCriarFaleConosco(FaleConosco);

        req.getRequestDispatcher("index.html").forward(req, resp);

    }

}
