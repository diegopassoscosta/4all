/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.lista03.exercicio02.pessoa;

import br.org.codeforlife.orientado.lista03.exercicio02.alimento.fruta.Maca;
import br.org.codeforlife.orientado.lista03.exercicio02.alimento.fruta.Mamao;
import br.org.codeforlife.orientado.lista03.exercicio02.alimento.verdura.Abobora;
import br.org.codeforlife.orientado.lista03.exercicio02.alimento.verdura.Beterraba;


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
