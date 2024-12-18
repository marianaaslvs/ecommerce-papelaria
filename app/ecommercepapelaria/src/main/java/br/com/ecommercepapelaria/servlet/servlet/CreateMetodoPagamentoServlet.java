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
public class CreateMetodoPagamentoServlet extends HttpServlet{



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/metodoPagamentos.jsp").forward(req, resp);
    }




    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idMetodoPagamento = req.getParameter("idMetodoPagamento");
        String titular = req.getParameter("titular");
        String numCartao = req.getParameter("numCartao");
        String validade = req.getParameter("validade");
        String codSeg = req.getParameter("codSeg");

        MetodoPagamentoDao metodoPagamentoDao = new MetodoPagamentoDao();
        MetodoPagamento metodoPagamento  = new MetodoPagamento(idMetodoPagamento,titular,numCartao,validade,codSeg);




        if(null == idMetodoPagamento || idMetodoPagamento.equals("")){
            metodoPagamentoDao.createMetodoPagamento(metodoPagamento);
        }
        else {
            metodoPagamentoDao.updateMetodoPagamento(metodoPagamento);
        }
        resp.sendRedirect("/confirmacao-pedido");

        }

    }
