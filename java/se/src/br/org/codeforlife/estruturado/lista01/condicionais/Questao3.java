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
public class Questao3 {

    public static void main(String args[]) {

        //declaração de variáveis
        float primeiraNota;
        float primeiroPeso;

        float segundaNota;
        float segundoPeso;

        float terceiraNota;
        float terceiroPeso;

        float quartaNota;
        float quartoPeso;

        float numeradorDaMediaPonderada;
        float denominadorDaMediaPonderada;

        float mediaFinal;
        float mediaDoCurso = 7.0f;
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a primeira nota: ");
        primeiraNota = leia.nextInt();
        System.out.println("Informe o primeiro peso: ");
        primeiroPeso = leia.nextInt();

        System.out.println("Informe a segunda nota: ");
        segundaNota = leia.nextInt();
        System.out.println("Informe o segundo peso: ");
        segundoPeso = leia.nextInt();

        System.out.println("Informe a terceira nota: ");
        terceiraNota = leia.nextInt();
        System.out.println("Informe o terceiro peso: ");
        terceiroPeso = leia.nextInt();

        System.out.println("Informe a quarta nota: ");
        quartaNota = leia.nextInt();
        System.out.println("Informe o quarto peso: ");
        quartoPeso = leia.nextInt();

        //calculos
        numeradorDaMediaPonderada = primeiraNota * primeiroPeso + segundaNota * segundoPeso + terceiraNota * terceiroPeso + quartaNota * quartoPeso;
        denominadorDaMediaPonderada = primeiroPeso + segundoPeso + terceiroPeso + quartoPeso;
        mediaFinal = numeradorDaMediaPonderada / denominadorDaMediaPonderada;
        
        //demonstração do resultado
        System.out.println("valor do numerador: \n" + numeradorDaMediaPonderada);
        System.out.println("valor do denominador: \n" + denominadorDaMediaPonderada);
        System.out.println("media do infeliz: \n" + mediaFinal);

        if (mediaFinal >= mediaDoCurso) {
            System.out.println("passou\n");
        } else {
            System.out.println("perdeu\n");
        }

    }
}
