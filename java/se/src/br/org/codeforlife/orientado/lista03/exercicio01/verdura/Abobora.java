/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.lista03.exercicio01.verdura;

/**
 *
 * @author Diego Passos Costa
 */
public class Abobora {
    private int peso;
    private int energia;

    /**
     * 
     * @param peso
     * @param energia 
     */
    public Abobora(int peso, int energia) {
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
