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
        req.getRequestDispatcher("/cliente.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String rua = req.getParameter("rua");
        String cidade = req.getParameter("cidade");
        String estado = req.getParameter("estado");
        String cpf = req.getParameter("cpf");
        String numero = req.getParameter("numero");
        String telefone = req.getParameter("telefone");

        Cliente cliente = new Cliente(nome, email, rua, cidade, estado, cpf, numero, telefone);

        ClienteDao clienteDao = new ClienteDao();
        clienteDao.criarCliente(cliente);

        resp.sendRedirect("/find-all-clientes");

    }

}
