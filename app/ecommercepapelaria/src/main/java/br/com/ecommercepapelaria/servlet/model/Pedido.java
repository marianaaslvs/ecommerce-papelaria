package br.com.ecommercepapelaria.servlet.model;

public class Pedido {

    private String codPedido;
    private String status;
    private String cliente;
    private String metodoPagamento;
    private String produto;

    public Pedido(String status, String cliente, String metodoPagamento, String produto) {
        this.status = status;
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
        this.produto = produto;
    }

    public Pedido(String codPedido, String status, String cliente, String metodoPagamento, String produto) {
        this.codPedido = codPedido;
        this.status = status;
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
        this.produto = produto;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public String getStatus() {
        return status;
    }

    public String getCliente() {
        return cliente;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public String getProduto() {
        return produto;
    }

}
