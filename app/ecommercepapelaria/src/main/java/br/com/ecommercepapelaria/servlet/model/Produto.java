package br.com.ecommercepapelaria.servlet.model;

public class Produto {

    private String nomeProduto;
    private String descricao;
    private String preco;

    public Produto(String nomeProduto, String descricao, String preco) {
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPreco() {
        return preco;
    }
}
