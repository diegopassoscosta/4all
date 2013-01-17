/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.estruturado.lista01.condicionais;

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
        System.out.println("%d\n" + primeiro_termo);
        System.out.println("%d\n" + segundo_termo);
        proximo_termo = segundo_termo + razao;
        for (int i = 0; i < 10; i++) {
            proximo_termo = proximo_termo + razao;
            System.out.println("%d\n" + proximo_termo);
        }
    }
}
