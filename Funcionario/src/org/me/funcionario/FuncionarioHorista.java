package org.me.funcionario;

public class FuncionarioHorista extends Funcionario {
    private double salarioHora, horasTrabalhadas;
    
    public FuncionarioHorista(String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    public void setSalarioHora(double salarioHora){
        this.salarioHora = salarioHora < 0? 0 : salarioHora;
    }
    
    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = 
                (horasTrabalhadas > 0 || horasTrabalhadas <= 168)? 
                horasTrabalhadas : 0;
    }
    
    @Override
    public double calcSalario(){
        if(horasTrabalhadas <= 40){
            return salarioHora * horasTrabalhadas;
        }
        else{
            return 40 * getSalarioHora() + 
                    (getHorasTrabalhadas() - 40) * getSalarioHora() * 1.5;
        }
    }
    
    @Override
    public String toString(){
        return String.format("%s\nSálario hora: %s\nHoras trabalhadas: %s"
        ,super.toString(), salarioHora,horasTrabalhadas);
    }
}


