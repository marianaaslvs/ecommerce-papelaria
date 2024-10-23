package br.com.ecommercepapelaria.servlet.model;

public class Produto {

    private String idProduto;
    private String nomeProduto;
    private String descricao;
    private double preco;

    public Produto(String idProduto, String nomeProduto, String descricao, double preco) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
