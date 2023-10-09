/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.empregado;

/**
 *
 * @author Fatec
 */
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
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the salario_base
     */
    public double getSalario_base() {
        return salario_base;
    }

    /**
     * @param salario_base the salario_base to set
     */
    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
