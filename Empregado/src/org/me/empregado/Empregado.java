package org.me.empregado;

public abstract class Empregado {
    private int codigo; 
    private double salario_base; 
    private String nome;
    
    public Empregado(int codigo, double salario_base, String nome){
        this.codigo = codigo;
        this.salario_base = salario_base;
        this.nome = nome;
    }
    
    public abstract void calc_salario();
    
    public String toString(){
        return String.format("%s: %s\n%s: %s\n%s: R$%s", "Código", 
                codigo, "Nome",nome,"Salario",salario_base);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

