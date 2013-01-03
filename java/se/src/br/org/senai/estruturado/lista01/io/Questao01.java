/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.estruturado.lista01.io;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao01 {

    public static void main(String args[]) {
        String nome;
        Scanner leia = new Scanner(System.in);
        System.out.println("Ola seu qual e o seu nome?");
        nome = leia.nextLine();
        System.out.println("Bonito nome: " + nome);

    }
}
