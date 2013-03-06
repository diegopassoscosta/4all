/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.sintaxe.arraylist1;

/**
 *
 * @author Diego Passos Costa
 */
class Item {
    
    public Item(int peso, String nome){
        this.peso = peso;
        this.nome = nome;
    }
    
    private int peso;
    private String nome;

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
