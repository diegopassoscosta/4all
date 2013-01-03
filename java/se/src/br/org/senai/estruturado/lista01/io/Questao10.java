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
public class Questao10 {

    public static void main(String args[]) {
        //declaração de variáveis
        float primeiro_termo = 0;
        float segundo_termo = 0;
        float terceiro_termo = 0;
        float razao = 0;

        Scanner leia = new Scanner(System.in);
        //solicitação do pedido
        System.out.println("Informe a primeira valor: ");
        primeiro_termo = leia.nextInt();

        System.out.println("Informe o segundo valor: ");
        segundo_termo = leia.nextInt();

        //calculos
        razao = segundo_termo - primeiro_termo;
        terceiro_termo = segundo_termo + razao;
        //demonstração do resultado

        System.out.println("primeiro termo: \n" + primeiro_termo);
        System.out.println("segundo termo: \n" + segundo_termo);
        System.out.println("razao: \n" + razao);
        System.out.println("terceiro termo: \n" + terceiro_termo);
        System.out.println("progressao aritimetica \n" + primeiro_termo +" "+ segundo_termo +" "+ terceiro_termo);

    }
}
