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
public class Questao2 {

    public static void main(String args[]) {
        //declaração de variáveis
        int primeiro_numero;
        int segundo_numero;
        int menor_numero;
        int maior_numero;

        Scanner leia = new Scanner(System.in);
        //solicitação do pedido
        System.out.println("Informe o primeiro numero: ");
        primeiro_numero = leia.nextInt();

        System.out.println("Informe o segundo numero: ");
        segundo_numero = leia.nextInt();

        if (primeiro_numero < segundo_numero) {
            menor_numero = primeiro_numero;
            maior_numero = segundo_numero;
        } else if (primeiro_numero > segundo_numero) {
            menor_numero = segundo_numero;
            maior_numero = primeiro_numero;
        } else { // tanto faz sao iguais
            menor_numero = segundo_numero;
            maior_numero = segundo_numero;
        }

        //calculos
        for (; menor_numero <= maior_numero; menor_numero++) {
            System.out.println("\n" + menor_numero);
        }

    }
}
