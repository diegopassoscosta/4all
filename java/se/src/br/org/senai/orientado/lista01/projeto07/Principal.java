/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.orientado.lista01.projeto07;


/**
 * @author Diego Passos Costa
 * Inserindo dados invalidos 
 */
public class Principal {

    public static void main(String args[]) {
        Carro meucarro = new Carro();
        meucarro.setModelo("Corsa");
        meucarro.setVelocidade(-23);
        
        System.out.println("O modelo de meu carro é: " + meucarro.getModelo());
        System.out.println("A velocidade de meu carro é: " + meucarro.getVelocidade());
        
    }
}
