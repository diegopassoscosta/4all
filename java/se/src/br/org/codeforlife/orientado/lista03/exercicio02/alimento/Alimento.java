/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.lista03.exercicio02.alimento;

/**
 *
 * @author Diego Passos Costa
 */
public class Alimento {
    private int peso;
    private int energia;

    /**
     * 
     * @param peso
     * @param energia 
     */
    public Alimento(int peso, int energia) {
        this.peso = peso;
        this.energia = energia;
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

    /**
     * @return the energia
     */
    public int getEnergia() {
        return energia;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
