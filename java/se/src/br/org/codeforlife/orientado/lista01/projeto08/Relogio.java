/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.lista01.projeto08;

/**
 *
 * @author Diego Passos Costa
 * Ajustando multiplos atributos
 */
public class Relogio {
    
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * @return a hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora a hora a ser ajustada
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return o minuto
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * @param minuto o minuto a hora a ser ajustado
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    /**
     * @return o segundo
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * @param segundo o segundo a hora a ser ajustado
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
     
}
