/*
 * Fonte: http://www.python.org.br/wiki/ExerciciosClasses
 * 
 * Classe Bola: Crie uma classe que modele uma bola:
 * Atributos: Cor, circunferência, material
 * Métodos: trocaCor e mostraCor
 */
package br.org.codeforlife.orientado.lista02.exercicio01.bola;

/**
 *
 * @author Diego Passos Costa
 */
public class Bola {
    
    private String cor;
    private int circunferencia;
    private int material;
    
    /**
     * Troca a cor da bola
     * @param cor 
     */
    public void trocaCor(String cor){
        this.cor = cor;
    }
    
    /**
     * Mostra a cor da bola
     * @return 
     */
    public String mostraCor(){
        return this.cor;
    }
    
}
