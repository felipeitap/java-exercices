package org.me.funcionario;

public class FuncionarioMensalista extends Funcionario{
    private double salarioMensal;
    
    public FuncionarioMensalista(String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
    }
    
    public double getSalarioMensal(){
        return salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal){
       this.salarioMensal = salarioMensal < 0?  0 :  salarioMensal;
    }
    
    @Override
    public double calcSalario(){
        return salarioMensal;
    }
    
    @Override
    public String toString(){
        return String.format("%s\nSalário: %s", super.toString(),
                getSalarioMensal());
    }
}


