package br.com.ecommercepapelaria.servlet.model;

public class User {

    private String cpf;
    private String senha;

    public User(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }
}
