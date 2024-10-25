package br.com.ecommercepapelaria.servlet.model;

public class Produto {

    private String idProduto;
    private String nomeProduto;
    private String descricao;
    private double preco;
    private String image;

    public Produto(String idProduto, String nomeProduto, String descricao, double preco, String image) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.image = image;
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

    public String getImage() {
        return image;
    }
}
