package org.me.empregado;
public class Engenheiro extends Empregado {
    private String departamento;
    private int CREA; 
    
    public Engenheiro(int codigo, double salario_base, String nome, 
            String departamento, int CREA){
            
        super(codigo, salario_base, nome);
        this.departamento = departamento;
        this.CREA = CREA;
    }
    
    @Override
    public void calc_salario(){
        double salarioAtual = super.getSalario_base();
        super.setSalario_base(salarioAtual + (salarioAtual * 0.5));
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the CREA
     */
    public int getCREA() {
        return CREA;
    }

    /**
     * @param CREA the CREA to set
     */
    public void setCREA(int CREA) {
        this.CREA = CREA;
    }
    
    @Override
    public String toString(){
        return String.format("\n%s\nDepartamento: %s\nCREA: %s", 
                super.toString(), departamento, CREA);
    }
}
