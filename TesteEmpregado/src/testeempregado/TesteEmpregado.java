package testeempregado;

import org.me.empregado.Engenheiro;
import org.me.empregado.Gerente;

public class TesteEmpregado {

    public static void main(String[] args) {
        Engenheiro e1 = new Engenheiro(001,5000,"Luiz",
                "Técnologia", 12321321);
        
        Gerente g1 = new Gerente(002, 3500, "Alex",
                500);
        
        
        System.out.printf(e1.toString());
        System.out.printf("\n%s\n\n",g1.toString());
        
        e1.calc_salario();
        g1.calc_salario();
        
        System.out.println("********Dados após ajuste de salario********");
        
        System.out.printf(e1.toString());
        System.out.printf("\n%s",g1.toString());
    }
    
}


