
package org.me.fornecedor;

public class Fornecedor {
    private String empresa, endereco, inscricao, contato;
    
    public Fornecedor(String empresa, String endereco, 
            String inscricao, String contato){
        
        this.empresa = empresa;
        this.endereco = endereco;
        this.inscricao = inscricao;
        this.contato = contato;
    }
           
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setInscricao(String inscricao){
        this.inscricao = inscricao;
    }
    
    public void setContato(String contato){
        this.contato = contato;
    }
        
    public String getEmpresa(){
        return empresa;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getInscricao(){
        return inscricao;   
    }
    
    public String getContato(){
        return contato;
    }
    
    
}
