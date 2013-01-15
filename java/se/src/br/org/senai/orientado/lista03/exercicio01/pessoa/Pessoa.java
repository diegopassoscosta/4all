/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.orientado.lista03.exercicio01.pessoa;

import br.org.senai.orientado.lista03.exercicio01.fruta.Maca;
import br.org.senai.orientado.lista03.exercicio01.fruta.Mamao;
import br.org.senai.orientado.lista03.exercicio01.verdura.Abobora;
import br.org.senai.orientado.lista03.exercicio01.verdura.Beterraba;

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
    public void come(Maca maca){
        this.energia += maca.getEnergia();
        this.peso += maca.getPeso();
    }
    
    /**
     * 
     * @param mamao 
     */
    public void come(Mamao mamao){
        this.energia += mamao.getEnergia();
        this.peso += mamao.getPeso();
    }
    
    /**
     * 
     * @param abobora 
     */
    public void come(Abobora abobora){
        this.energia += abobora.getEnergia();
        this.peso += abobora.getPeso();
    }
    /**
     * 
     * @param maca 
     */
    public void come(Beterraba maca){
        this.energia += maca.getEnergia();
        this.peso += maca.getPeso();
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
