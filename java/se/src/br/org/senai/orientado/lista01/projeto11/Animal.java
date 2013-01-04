/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.orientado.lista01.projeto11;

/**
 *
 * @author lab01
 */
public class Animal {
    
    private boolean vivo = true;
    private int velocidade = 0;
    private int altura = 0;
    private int peso = 0;
    private int largura = 0;

    /**
     * @return se esta vivo
     */
    public boolean isVivo() {
        return vivo;
    }

    /**
     * @param vivo estado de vida a ser ajustado
     */
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    /**
     * @return a velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade velocidade a ser ajustada
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return a altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura altura a ser ajustada
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return o peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso peso a ser ajustado
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return a largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura largura a ser ajustada
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }
    
}
