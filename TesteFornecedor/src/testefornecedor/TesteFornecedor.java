
package testefornecedor;

import org.me.fornecedor.Fornecedor;

public class TesteFornecedor {


    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("Code and Soul", 
                "Rua José Gomes de Camargo",
                "12321.123123",
                "(15) 99899-39439");
        
        Fornecedor fornecedor2 = new Fornecedor("Fiotoões.inc", 
                "Rua Fraterno de Mello Almada",
                "9954884.943838",
                "(15)99899-45331");
        
        String dadosForn1 = "Empresa: " + fornecedor1.getEmpresa() + "\n"
                          + "Endereço: " + fornecedor1.getEndereco() + "\n"
                          + "Inscrição Estadual: " + fornecedor1.getInscricao()
                          + "\nContato: " + fornecedor1.getContato();
        
        String dadosForn2 = "Empresa: " + fornecedor2.getEmpresa() + "\n"
                          + "Endereço: " + fornecedor2.getEndereco() + "\n"
                          + "Inscrição Estadual: " + fornecedor2.getInscricao()
                          + "\nContato: " + fornecedor2.getContato();
       
        System.out.println(dadosForn1);
        System.out.println("");
        System.out.println(dadosForn2);
    }
    
        
      
}
