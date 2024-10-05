package br.com.ecommercepapelaria.servlet.servlet;


import br.com.ecommercepapelaria.servlet.dao.MetodoPagamentoDao;
import br.com.ecommercepapelaria.servlet.model.MetodoPagamento;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/criar-metodoPagamento")
public class CreateMetodoPagamentoServlet  extends HttpServlet{



        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String idMetodoPagamento = req.getParameter("metodoPagamento");



            MetodoPagamento metodoPagamento  = new MetodoPagamento();

            metodoPagamento.setIdMetodoPagamento(idMetodoPagamento);



            MetodoPagamentoDao metodoPagamentoDao = new MetodoPagamentoDao();
            metodoPagamentoDao.createMetodoPagamento(metodoPagamento);

            req.getRequestDispatcher("index.html").forward(req, resp);

        }

    }
