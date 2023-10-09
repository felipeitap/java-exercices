package org.me.funcionario;

public abstract class Funcionario {
    private String nome, sobrenome, cpf;
    
    public Funcionario(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public abstract double calcSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String toString(){
        return String.format("Nome: %s\nSobrenome: %s\nCPF: %s",
                getNome(),getSobrenome(), getCpf());
    }
    
}


