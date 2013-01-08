/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.estruturado.lista01.repeticoes;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao12 {

    public static void main(String args[]) {
        int primeiro_numero = 0;
        int segundo_numero = 0;
        int resultado = 1;

        Scanner leia = new Scanner(System.in);

        System.out.println("informe o primero numero: ");
        primeiro_numero = leia.nextInt();

        System.out.println("informe o segundo numero: ");
        segundo_numero = leia.nextInt();;

        for (int i = primeiro_numero; i <= segundo_numero; i++) {

            if (i % 2 == 0) {

                for (int j = i; j > 0; j--) {
                    resultado *= j;
                }
                System.out.println("fatorial de " + i + " e " + resultado + "");
                resultado = 1;
            }
        }
    }
}