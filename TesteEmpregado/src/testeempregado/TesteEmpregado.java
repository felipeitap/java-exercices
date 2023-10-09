/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeempregado;

import org.me.empregado.Empregado;
import org.me.empregado.Engenheiro;
import org.me.empregado.Gerente;

/**
 *
 * @author Fatec
 */
public class TesteEmpregado {

    /**
     * @param args the command line arguments
     */
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
