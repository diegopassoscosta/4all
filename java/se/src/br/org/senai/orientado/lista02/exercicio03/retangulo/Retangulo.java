/*
 * Classe Retangulo: Crie uma classe que modele um retangulo:
 * Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
 * Métodos: Mudar valor do base, Retornar valor da bases,
 * Mudar valor da altura, Retornar valor da altura
 * calcular Área base x altura e calcular Perímetro (soma de todos os lados);
 * Crie um programa que utilize esta classe. 
 * Ele deve pedir ao usuário que informe as medidades de um local. 
 * Depois, deve criar um objeto com as medidas e calcular
 * a base e o perimetro e informar na tela
 */
package br.org.senai.orientado.lista02.exercicio03.retangulo;

/**
 *
 * @author Diego Passos Costa
 */
public class Retangulo {
    
    private int base;
    private int altura;
    
    /**
     * Muda o valor da base do retangulo
     * @param base 
     */
    public void mudarValorDaBase(int base){
    
        this.base = base;
    
    }
    
    /**
     * Retorna o valor da base do retangulo
     * @return base 
     */
    public int retornarValorDaBase(){
        return base;
    }
    
    /**
     * Muda o valor da altura do retangulo
     * @param altura 
     */
    public void mudarValorDaAltura(int altura){
    
        this.altura = altura;
    
    }
    
    /**
     * Retorna o valor da altura do retangulo
     * @return altura 
     */
    public int retornarValorDaAltura(){
        return altura;
    }
    
    /**
     * Calcula area do retangulo
     * @return 
     */
    public int calcularAreaDoRetangulo(){
    
        return retornarValorDaBase()*retornarValorDaAltura()/2;
    
    }
    
    /**
     * Calcula o perimetro do retangulo
     * @return 
     */
    public int calcularPerimetroDoRetangulo(){
        return retornarValorDaAltura() + retornarValorDaAltura() + retornarValorDaBase() + retornarValorDaBase(); 
    }
    
}
