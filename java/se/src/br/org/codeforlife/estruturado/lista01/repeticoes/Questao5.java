/**
 * Faça um programa que receba os dois primeiros termos de uma progressão
 * aritmética e mostre na tela os 10 primeiros termos da pa
 */
package br.org.codeforlife.estruturado.lista01.repeticoes;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao5 {

    public static void main(String args[]) {

        int primeiro_termo = 0;
        int segundo_termo = 0;
        int proximo_termo = 0;
        int razao = 0;

        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a primeira valor: ");
        primeiro_termo = leia.nextInt();

        System.out.println("Informe o segundo valor: ");
        segundo_termo = leia.nextInt();

        //calculos
        razao = segundo_termo - primeiro_termo;

        //demonstração do resultado
        //System.out.println(primeiro_termo);
        //System.out.println(segundo_termo);
        proximo_termo = segundo_termo + razao;
        for (int i = 0; i < 2; i++) {
            proximo_termo = proximo_termo + razao;
            System.out.println(proximo_termo);
        }

    }
}
