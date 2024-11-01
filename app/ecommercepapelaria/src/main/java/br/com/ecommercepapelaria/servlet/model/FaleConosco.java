package br.com.ecommercepapelaria.servlet.model;

public class FaleConosco {

    private  String idDuvida;
    private String nome;
    private String email;
    private String duvida;
    private String status;

    public FaleConosco(String idDuvida, String nome, String email, String duvida, String status) {
        this.idDuvida = idDuvida;
        this.nome = nome;
        this.email = email;
        this.duvida = duvida;
        this.status = status;
    }

    public String getIdDuvida() {
        return idDuvida;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDuvida() {
        return duvida;
    }

    public String getStatus() {
        return status;
    }
}
