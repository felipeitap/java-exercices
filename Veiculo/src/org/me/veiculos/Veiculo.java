package org.me.veiculos;

public abstract class Veiculo {
    protected String marca,modelo, potencia_motor, capacidade_carga;
    protected int ano;
    
    public Veiculo(String marca, String modelo,int ano, String potencia_motor,
            String capacidade_carga){
        this.marca = marca;
        this.modelo = modelo; 
        this.ano = ano;
        this.potencia_motor = potencia_motor;
        this.capacidade_carga = capacidade_carga;
}
    public abstract void imprime();

}
