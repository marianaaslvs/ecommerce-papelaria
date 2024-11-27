package br.com.ecommercepapelaria.servlet.model;

public class Pedido {

    private String codPedido;
    private String status;
    private String cliente;
    private String data;
    private String produto;
    private String endereco;

    private double valor;

    public Pedido(String cliente, String produto, String data, String endereco, double valor, String status) {
        this.cliente = cliente;
        this.produto = produto;
        this.data = data;
        this.endereco = endereco;
        this.valor = valor;
        this.status = status;
    }

    public Pedido(String codPedido, String cliente, String produto, String data, String endereco, double valor, String status) {
        this.codPedido = codPedido;
        this.cliente = cliente;
        this.produto = produto;
        this.data = data;
        this.endereco = endereco;
        this.valor = valor;
        this.status = status;

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

    public String getProduto() {
        return produto;
    }

    public String getData() {
        return data;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

}
