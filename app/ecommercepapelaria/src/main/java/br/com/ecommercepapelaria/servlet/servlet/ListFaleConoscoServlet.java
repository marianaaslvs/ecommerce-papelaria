package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.FaleConoscoDao;
import br.com.ecommercepapelaria.servlet.model.FaleConosco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-duvidas")
public class ListFaleConoscoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        FaleConoscoDao faleConoscoDao = new FaleConoscoDao();

        List<FaleConosco> allDuvidas = faleConoscoDao.findAllDuvidas();

        req.setAttribute("duvidas", allDuvidas);

        req.getRequestDispatcher("/faleConosco.jsp").forward(req, resp);

    }
}
