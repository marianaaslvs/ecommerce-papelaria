package br.com.ecommercepapelaria.servlet.servlet;


import br.com.ecommercepapelaria.servlet.dao.MetodoPagamentoDao;
import br.com.ecommercepapelaria.servlet.model.MetodoPagamento;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-metodoPagamento")
public class ListMetodoPagamentoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MetodoPagamentoDao metodoPagamentoDao = new MetodoPagamentoDao();

        List<MetodoPagamento> allMetodoPagamento = metodoPagamentoDao.findAllMetodoPagamento();

        req.setAttribute("metodoPagamento", allMetodoPagamento);

        req.getRequestDispatcher("/metodoPagamento.jsp").forward(req, resp);

    }


    }
