/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.estruturado.lista01.io;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao03 {

    public static void main(String args[]) {
        int centigrados;
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o valor em Centigrados: ");
        centigrados = leia.nextInt();
        System.out.println("A conversao de Centigrados para Fahrenheit e: %d \n" + ((9 * centigrados) + 160) / 5);

    }
}
