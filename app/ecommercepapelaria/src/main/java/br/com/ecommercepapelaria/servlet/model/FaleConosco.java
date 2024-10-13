package br.com.ecommercepapelaria.servlet.model;

public class FaleConosco {

    private String nome;
    private String email;
    private String duvida;

    public FaleConosco(String nome, String email, String duvida) {
        this.nome = nome;
        this.email = email;
        this.duvida = duvida;
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
}
