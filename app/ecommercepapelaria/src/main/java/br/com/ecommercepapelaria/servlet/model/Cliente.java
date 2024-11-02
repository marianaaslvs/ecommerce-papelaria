package br.com.ecommercepapelaria.servlet.model;

public class Cliente {

    private String idCliente;
    private String telefone;
    private String cpf;
    private String numero;
    private String email;
    private String nome;
    private String rua;
    private String cidade;
    private String estado;
    private String senha;

    public Cliente(String nome, String cpf, String telefone, String email, String rua, String numero, String cidade, String estado, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.senha = senha;
    }

    public Cliente(String idCliente, String nome, String cpf, String telefone, String email, String rua, String numero, String cidade, String estado, String senha) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.senha = senha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getSenha() {
        return senha;
    }
}
