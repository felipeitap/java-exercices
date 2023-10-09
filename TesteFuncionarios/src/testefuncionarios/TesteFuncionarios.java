package testefuncionarios;

import org.me.funcionario.FuncionarioComissao;
import org.me.funcionario.FuncionarioHorista;
import org.me.funcionario.FuncionarioMensalista;

public class TesteFuncionarios {
    public static void main(String[] args) {
        FuncionarioMensalista f1 = new FuncionarioMensalista("Luiz",
                "Cunha", "488.753.728-02");
        
        FuncionarioHorista f2 = new FuncionarioHorista("Alex", 
                "Vaz", "123.456.789-01");
        
        FuncionarioComissao f3 = new FuncionarioComissao("Richard", 
                "Seabra","098.765.432-10");
        
        f1.setSalarioMensal(12000);
        
        f2.setSalarioHora(40);
        f2.setHorasTrabalhadas(160);
              
        f3.setVendaBruta(15000);
        f3.setComissao(0.5);
        
        System.out.printf(f1.toString());
        System.out.printf("\n\n%s\n",f2.toString());
        System.out.printf("Sálario final: %s\n",f2.calcSalario());
        System.out.printf("\n%s\n",f3.toString());
        System.out.printf("Sálario final: %s\n",f3.calcSalario());
        
        
    }          
}


