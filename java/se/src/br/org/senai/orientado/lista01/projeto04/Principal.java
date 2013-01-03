/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.orientado.lista01.projeto04;

/**
 * @author Diego Passos Costa
 * Permitindo a modificação
 * Verificando que ainda exist restrição ao acesso
 */
public class Principal {

    public static void main(String args[]) {
        Carro meucarro = new Carro();
        meucarro.setModelo("Corsa");
        meucarro.setVelocidade(23);
        
        System.out.println("O modelo de meu carro é: " + meucarro.modelo);
        System.out.println("A velocidade de meu carro é: " + meucarro.velocidade);
        
    }
}
