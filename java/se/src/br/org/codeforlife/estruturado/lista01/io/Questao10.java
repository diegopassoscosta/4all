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
public class Questao10 {

    public static void main(String args[]) {
        //declaração de variáveis
        float primeiroTermo = 0;
        float segundoTermo = 0;
        float terceiroTermo = 0;
        float razao = 0;

        Scanner leia = new Scanner(System.in);
        //solicitação do pedido
        System.out.println("Informe a primeira valor: ");
        primeiroTermo = leia.nextInt();

        System.out.println("Informe o segundo valor: ");
        segundoTermo = leia.nextInt();

        //calculos
        razao = segundoTermo - primeiroTermo;
        terceiroTermo = segundoTermo + razao;
        //demonstração do resultado

        System.out.println("primeiro termo: \n" + primeiroTermo);
        System.out.println("segundo termo: \n" + segundoTermo);
        System.out.println("razao: \n" + razao);
        System.out.println("terceiro termo: \n" + terceiroTermo);
        System.out.println("progressao aritimetica \n" + primeiroTermo +" "+ segundoTermo +" "+ terceiroTermo);

    }
}
