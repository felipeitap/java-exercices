package org.me.funcionario;

public class FuncionarioComissao extends Funcionario {
    private double vendaBruta, comissao;
    
    public FuncionarioComissao(String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
    }

    public double getVendaBruta() {
        return vendaBruta;
    }

    public double getComissao() {
        return comissao;
    }
    
    public void setVendaBruta(double vendaBruta){
        this.vendaBruta = vendaBruta < 0? 0 : vendaBruta;
    }
    
    public void setComissao(double comissao){
        this.comissao = (comissao > 0 && comissao < 1)? comissao : 0; 
    }
    
    @Override
    public double calcSalario(){
        return vendaBruta * comissao;
    }
    
    @Override
    public String toString(){
        return String.format("%s\nVenda bruta: %s\nComissão: %s",
                super.toString(), vendaBruta, comissao);
    }
}


