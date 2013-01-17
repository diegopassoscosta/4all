/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.lista01.projeto05;

/**
 * @author Diego Passos Costa
 * Permitindo a modificação
 * Permitindo o acesso de leitura e escrita as
 * propriedades
 */
public class Principal {

    public static void main(String args[]) {
        Carro meucarro = new Carro();
        meucarro.setModelo("Corsa");
        meucarro.setVelocidade(23);
        
        System.out.println("O modelo de meu carro é: " + meucarro.getModelo());
        System.out.println("A velocidade de meu carro é: " + meucarro.getVelocidade());
        
    }
}
