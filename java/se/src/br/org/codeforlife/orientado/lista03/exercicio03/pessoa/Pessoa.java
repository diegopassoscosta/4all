/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.lista03.exercicio03.pessoa;

import br.org.codeforlife.orientado.lista03.exercicio03.alimento.Alimento;


/**
 *
 * @author lab01
 */
public class Pessoa {
    private int peso;
    private int energia;
    
    /**
     * 
     * @param maca 
     */
    public void come(Alimento alimento){
        this.energia += alimento.getEnergia();
        this.peso += alimento.getPeso();
    }
    
    /**
     * 
     * @return 
     */
    public int energia(){
        return this.energia;
    }
    
    /**
     * 
     * @return 
     */
    public int peso(){
        return this.peso;
    }
    
}
