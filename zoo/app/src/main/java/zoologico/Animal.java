/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author dcosta1406
 */
public class Animal {
    private double tamanho;
    private double peso;
    private String nome;
   
    public Animal(){
        
    }
    
    public Animal(double tamanho, double peso, String nome){
        this.nome = nome;
        this.peso = peso;
        this.tamanho = tamanho;
    }
    
    
    public double getTamanho() {
        return tamanho;
    }

    
    public void setTamanho(double tamanho) {
        if (tamanho >= 1){
            this.tamanho = tamanho;
        }else{
            this.tamanho = 0;
        }
    }
   
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 1){
            this.peso = peso;
        }else{
            this.peso = 0;
        }
    }
    
    
    
    
    public void Comer(){
        this.peso = this.peso+1;
    }
    
    public void Comer(int peso){
        this.peso = this.peso+peso;
    }

    
    
    
    
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
