package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.PedidoDao;
import br.com.ecommercepapelaria.servlet.model.Pedido;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    @WebServlet("/criar-pedido")

    public class CreatePedidoServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("/pedido.html").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String cliente = req.getParameter("cliente");
            String produto = req.getParameter("produto");
            String metodoDePagamento = req.getParameter("metodoDePagamento");
            String status = req.getParameter("status");


            Pedido pedido = new Pedido(status, cliente, metodoDePagamento, produto);

            PedidoDao pedidoDao = new PedidoDao();
            pedidoDao.criarPedido(pedido);

            resp.sendRedirect("/find-all-pedidos");

        }
    }
