package br.com.ecommercepapelaria.servlet.model;

public class Login {

    private String cpf;
    private String senha;


    public Login(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }





}
