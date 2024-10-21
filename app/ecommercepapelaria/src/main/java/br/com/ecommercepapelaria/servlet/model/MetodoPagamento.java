package br.com.ecommercepapelaria.servlet.model;

public class MetodoPagamento {
    private String idMetodoPagamento;
private String titular;
private String numCartao;
private String validade;
private String codSeg;


    public MetodoPagamento(String idMetodoPagamento, String titular, String numCartao, String validade, String codSeg) {
        this.idMetodoPagamento = idMetodoPagamento;
        this.titular = titular;
        this.numCartao = numCartao;
        this.validade = validade;
        this.codSeg = codSeg;
    }

    public String getIdMetodoPagamento() {
        return idMetodoPagamento;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public String getValidade() {
        return validade;
    }

    public String getCodSeg() {
        return codSeg;
    }


}
