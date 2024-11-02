package br.com.ecommercepapelaria.servlet.model;

public class Carrinho {
    private int idCarrinho;
    private String idCliente;
    private String idProduto;


    public Carrinho(String idCliente, String idProduto) {
        this.idCliente = idCliente;
        this.idProduto = idProduto;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

   public String getIdCliente() {
        return idCliente;
    }


    public String getIdProduto() {
        return idProduto;
    }


}
