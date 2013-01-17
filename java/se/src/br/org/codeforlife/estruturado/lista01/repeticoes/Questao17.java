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
public class Questao17 {

    public static void main(String args[]) {
        int numero = 0;
        int numero_atual = 0;
        int numero_anterior = 0;
        int primeiro_valor_digitado = 0;
        int contador = 0;
        boolean continua = true;

        Scanner leia = new Scanner(System.in);

        System.out.println("informe o primeiro numero: ");
        primeiro_valor_digitado = leia.nextInt();

        while (continua) {
            System.out.println("informe um numero a ser somado: ");
            numero = leia.nextInt();;
            numero_anterior = numero_atual;
            numero_atual = numero;
            ++contador;
            System.out.println("contador " + contador);
            if (contador == 2) {
                if (primeiro_valor_digitado == (numero_atual + numero_anterior)) {
                    continua = false;
                    contador = 0;
                    System.out.println("aqui");
                }
            }

            if (contador == 2) {
                System.out.println("atual " + numero_atual + " anterior " + numero_anterior + "");
                contador = 0;
            }
        }

        System.out.println("saiu");


    }
}
