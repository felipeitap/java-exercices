package org.me.empregado;

public class Gerente  extends Empregado{
    private double bonus;
    
    public Gerente(int codigo, double salario_base, String nome, double bonus){
        super(codigo, salario_base, nome);
        this.bonus = bonus;
    }
    
    @Override
    public void calc_salario(){
        double salarioAtual = super.getSalario_base();
        
        super.setSalario_base(salarioAtual + getBonus());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String toString(){
        return String.format("\n%s\nBônus: %s",super.toString(),
                bonus);
    }
    
}


