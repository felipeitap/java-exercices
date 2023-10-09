package org.me.veiculos;

public class Passageiros extends Veiculo{
    private int qtd_passageiros;
    
    public Passageiros(String marca, String modelo,int ano, 
            String potencia_motor, String capacidade_carga, 
            int qtd_passageiros){
        
        super(marca, modelo, ano, potencia_motor, capacidade_carga);
        this.qtd_passageiros = qtd_passageiros;
    }
    
    @Override
       public void imprime(){
           System.out.println("Marca: " + marca);
           System.out.println("Modelo: " + modelo);
           System.out.println("Ano: " + ano);
           System.out.println("Potência do motor: " + potencia_motor);
           System.out.println("Capacidade de carga: " + capacidade_carga);
           System.out.println("Quantidade de passageiros: " + qtd_passageiros);
           System.out.println();
       }
}

