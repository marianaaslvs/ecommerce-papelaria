package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.ClienteDao;
import br.com.ecommercepapelaria.servlet.model.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-cars")
public class ListClienteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ClienteDao clienteDao = new ClienteDao();

        List<Cliente> allClientes = clienteDao.findAllClientes();

        req.setAttribute("clientes", allClientes);

        req.getRequestDispatcher("/dashboard.jsp").forward(req, resp);

    }
}
