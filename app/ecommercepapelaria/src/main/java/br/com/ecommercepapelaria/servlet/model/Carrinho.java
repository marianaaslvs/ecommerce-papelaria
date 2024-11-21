package br.com.ecommercepapelaria.servlet.model;

public class Carrinho {
    private String idCarrinho;
    private String idCliente;
    private String idProduto;
    private int quantidade;


    public Carrinho(String idCarrinho, String idCliente, String idProduto, int quantidade) {
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public String getIdCarrinho() {
        return idCarrinho;
    }

   public String getIdCliente() {
        return idCliente;
    }


    public String getIdProduto() {
        return idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

}

