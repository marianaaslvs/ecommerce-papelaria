package br.com.ecommercepapelaria.servlet.model;

public class Cliente {

    private int idCliente;
    private String telefone;
    private String cpf;
    private String numero;
    private String email;
    private String nome;
    private String rua;
    private String cidade;
    private String estado;

    public Cliente(String telefone, String cpf, String numero, String email, String nome, String rua, String cidade, String estado) {
        this.telefone = telefone;
        this.cpf = cpf;
        this.numero = numero;
        this.email = email;
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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


}
