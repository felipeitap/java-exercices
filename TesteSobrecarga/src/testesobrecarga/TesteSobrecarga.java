package testesobrecarga;

import org.me.sobrecarga.Sobrecarga;

public class TesteSobrecarga {

    public static void main(String[] args) {
        Sobrecarga sobr1 = new Sobrecarga();
        Sobrecarga sobr2 = new Sobrecarga();
        
        sobr1.adiciona(5, 5);
        sobr1.adiciona(10, 5, 2);
        sobr1.adiciona(25.5, 30.5);
        sobr1.adiciona("Luiz", "Cunha");
        
        System.out.println("");
        
        sobr2.adiciona(17, 25);
        sobr2.adiciona(11, 52, 9);
        sobr2.adiciona(11.75, 22.44);
        sobr2.adiciona("Alex", "Vaz");
    }
}
