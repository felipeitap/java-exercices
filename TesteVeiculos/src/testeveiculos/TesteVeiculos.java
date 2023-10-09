package testeveiculos;

import org.me.veiculos.Passageiros;
import org.me.veiculos.Utilitarios;
import org.me.veiculos.Veiculo;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[4];
        
        veiculos[0] = new Utilitarios("Fiat", "Toro", 2023,
                "105cv", "1000kg", "Dupla");
        
        veiculos[1] = new Utilitarios("Chevrolet", "Montana", 
                2023, "80cv", "756kg",
                "Extendida");
        
        veiculos[2] = new Passageiros("Volkswagen", "Golf",
                2024, "120cv", "250kg", 
                5);
        
        veiculos[3] = new Passageiros("BMW", "X6", 2023, 
                "381cv",  "250kg", 5);
        
        for(int x = 0; x < 4; x++ ){
            veiculos[x].imprime();
        }
    }
    
}

