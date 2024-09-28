package br.com.ecommercepapelaria.servlet.model;

public class FaleConosco {

    private int idFaleConosco;
    private String nome;
    private String email;
    private String duvida;

    public int getIdFaleConosco() {
        return idFaleConosco;
    }

    public void setIdFaleConosco(int idFaleConosco) {
        this.idFaleConosco = idFaleConosco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDuvida() {
        return duvida;
    }

    public void setDuvida(String duvida) {
        this.duvida = duvida;
    }


}
