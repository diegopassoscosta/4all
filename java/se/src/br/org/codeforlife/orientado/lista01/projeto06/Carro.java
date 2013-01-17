/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.lista01.projeto06;

/**
 *
 * @author Diego Passos Costa
 */
public class Carro {

    private int velocidade;
    private String modelo;

    /**
     * @param velocidade a velocidade a ser ajustada
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @param modelo o modelo a ser ajustado
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return a velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @return o modelo
     */
    public String getModelo() {
        return modelo;
    }
}
