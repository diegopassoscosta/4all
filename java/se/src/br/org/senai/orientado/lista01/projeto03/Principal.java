/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.orientado.lista01.projeto03;

/**
 * @author Diego Passos Costa
 * Restringindo o acesso
 */
public class Principal {

    public static void main(String args[]) {
        Carro meucarro = new Carro();
        meucarro.modelo = "Corsa";
        meucarro.velocidade = -23;
        
        System.out.println("O modelo de meu carro é: " + meucarro.modelo);
        System.out.println("A velocidade de meu carro é: " + meucarro.velocidade);
        
    }
}
