/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.revisao.classe;

/**
 *
 * @author Diego Passos Costa
 */
public abstract class Animal {
    private String cor;
    private int tamanho;
    private int peso;

    
    public Animal(){
        this.cor = "";
        this.tamanho = 0;
        this.peso = 0;
    
    }
    
    public Animal(String cor, int tamanho, int peso){
        this.cor = cor;
        this.tamanho = tamanho;
        this.peso = peso;
    
    }
    
    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    /**
     * 
     * @param peso 
     */
    public void comer(int peso){
        if (peso>=0){
            this.peso += peso;
        }
        
    
    }
    
    public void correr(){
        this.setPeso(this.getPeso() - 1);
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    
    
    }    
}
