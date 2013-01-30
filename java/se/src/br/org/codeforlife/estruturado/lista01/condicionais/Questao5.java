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
        int primeiroTermo = 0;
        int segundoTermo = 0;
        int proximoTermo = 0;
        int razao = 0;
        
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a primeira valor: ");
        primeiroTermo = leia.nextInt();

        System.out.println("Informe o segundo valor: ");
        segundoTermo = leia.nextInt();

        //calculos
        razao = segundoTermo - primeiroTermo;

        //demonstração do resultado
        System.out.println("%d\n" + primeiroTermo);
        System.out.println("%d\n" + segundoTermo);
        proximoTermo = segundoTermo + razao;
        for (int i = 0; i < 10; i++) {
            proximoTermo = proximoTermo + razao;
            System.out.println("%d\n" + proximoTermo);
        }
    }
}
