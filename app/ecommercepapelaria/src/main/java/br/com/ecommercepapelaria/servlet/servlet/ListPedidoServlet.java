package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.PedidoDao;
import br.com.ecommercepapelaria.servlet.model.Pedido;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/find-all-pedidos","/admin/find-all-pedidos"})
 public class ListPedidoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PedidoDao pedidoDao = new PedidoDao();

        List<Pedido> allPedidos = pedidoDao.findAllPedidos();

        req.setAttribute("pedidos", allPedidos);

        req.getRequestDispatcher("/pedido.jsp").forward(req, resp);

    }
}