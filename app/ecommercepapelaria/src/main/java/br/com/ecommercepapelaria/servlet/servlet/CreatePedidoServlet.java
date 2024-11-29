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
        req.getRequestDispatcher("/pedidos.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String codPedido = req.getParameter("codPedido");
        String cliente = req.getParameter("cliente");
        String produto = req.getParameter("produto");
        String data = req.getParameter("data");
        String endereco = req.getParameter("endereco");
        double valor = Double.parseDouble(req.getParameter("valor"));
        String status = req.getParameter("status");


        PedidoDao pedidoDao = new PedidoDao();
        Pedido pedido = new Pedido(codPedido, cliente, produto, data, endereco, valor, status);

        if (null == codPedido || codPedido.equals("")) {

            pedidoDao.criarPedido(pedido);

        } else {

            pedidoDao.updatePedido(pedido);
        }

        resp.sendRedirect("/find-all-pedidos");

    }
}
