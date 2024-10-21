package br.com.ecommercepapelaria.servlet.servlet;

import br.com.ecommercepapelaria.servlet.dao.ClienteDao;
import br.com.ecommercepapelaria.servlet.model.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/criar-cliente")

public class CreateClienteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/clientes.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String idCliente = req.getParameter("idCliente");
        String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String telefone = req.getParameter("telefone");
        String email = req.getParameter("email");
        String rua = req.getParameter("rua");
        String numero = req.getParameter("numero");
        String cidade = req.getParameter("cidade");
        String estado = req.getParameter("estado");

        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente(idCliente, nome, cpf, telefone, email, rua, numero, estado, cidade);

        if (idCliente.isBlank()) {

            clienteDao.criarCliente(cliente);

        } else {

            clienteDao.updateCliente(cliente);
        }

        resp.sendRedirect("/find-all-clientes");

    }

}
