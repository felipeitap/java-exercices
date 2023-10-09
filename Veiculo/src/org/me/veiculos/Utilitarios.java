package org.me.veiculos;

public class Utilitarios extends Veiculo {
       private String cabine;
       
       public Utilitarios(String marca, String modelo,int ano, 
               String potencia_motor, String capacidade_carga, String cabine){
           
           super(marca, modelo, ano, potencia_motor, capacidade_carga);
           
           this.cabine = cabine;
       }
       
       @Override
       public void imprime(){
           System.out.println("Marca: " + marca);
           System.out.println("Modelo: " + modelo);
           System.out.println("Ano: " + ano);
           System.out.println("Potência do motor: " + potencia_motor);
           System.out.println("Capacidade de carga: " + capacidade_carga);
           System.out.println("Tipo de cabine: " + cabine);
           System.out.println();
       }
}


