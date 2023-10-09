package org.me.sobrecarga;
public class Sobrecarga {
    public void adiciona(int num, int num1){
        int sum = num + num1;
        System.out.println(sum);
               
    }
   
    public void adiciona(int num, int num1, int num2){
        int sum = num + num1 + num2;
        System.out.println(sum);
    }
    
    public void adiciona(double num, double num1){
        double sum = num + num1;
        System.out.println(sum);
    }
    
    public void adiciona(String nome, String sobrenome){
        String fullName = nome + " " + sobrenome;
        System.out.println(fullName);
    }
}
