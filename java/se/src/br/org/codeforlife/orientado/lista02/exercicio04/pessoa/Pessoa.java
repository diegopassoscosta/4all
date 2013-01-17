/*
 * http://www.python.org.br/wiki/ExerciciosClasses
 * Classe Pessoa: Crie uma classe que modele uma pessoa:
 *
 * Atributos: nome, idade, peso e altura
 * Métodos: Envelhercer, engordar, emagrecer, crescer.
 * Obs: Por padrão, a cada ano que nossa pessoa envelhece,
 * sendo a idade dela menor que 21 anos, 
 * ela deve crescer 0,5 cm.
 */
package br.org.codeforlife.orientado.lista02.exercicio04.pessoa;

/**
 *
 * @author Diego Passos Costa
 */
public class Pessoa {
    
    private int nome;
    private int peso;
    private float altura;
    
    public void crescer(){
        if(this.altura < 21){
            this.altura = this.altura+ 0.5f;
        }
    }
    
    /**
     * 
     */
    public void envelhecer(){
    
    }
    
    /**
     * 
     */
    public void engordar(){
    
    }
    
    /**
     * 
     */
    public void emagrecer(){
    
    }
    
}
