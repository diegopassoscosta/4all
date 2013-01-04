/*
 * Fonte: http://www.python.org.br/wiki/ExerciciosClasses
 * 
 * Classe Quadrado: Crie uma classe que modele um quadrado:
 * Atributos: Tamanho do lado
 * Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
 */
package br.org.senai.orientado.lista02.exercicio02.quadrado;

/**
 *
 * @author Diego Passos Costa
 */
public class Quadrado {
    
    private int lado;
    
    /**
     * 
     * @param lado muda o valor do lado do quadrado
     */
    public void mudaValorDoLado(int lado){
        this.lado = lado;
    }
    
    /**
     * 
     * @return o valor do lado
     */
    public int retornaValorDoLado(){
    
        return this.lado;
        
    }
    
    /**
     * 
     * @return o calculo da area de um quadrado
     */
    public int calculaArea(){
    
        return this.lado * this.lado;
        
    }
    
}
