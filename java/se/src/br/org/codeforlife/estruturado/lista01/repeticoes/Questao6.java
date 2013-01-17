/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.estruturado.lista01.repeticoes;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao6 {

    public static void main(String args[]) {
        int numero = 0;
        int resultado = 1;

        Scanner leia = new Scanner(System.in);
        System.out.println("informe o numero: ");
        numero = leia.nextInt();
        for (int i = numero; i > 0; i--) {
            resultado *= i;
        }
        System.out.println(resultado);

    }
}
