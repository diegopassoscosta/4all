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
public class Questao4 {

    public static void main(String args[]) {
        //declaração de variáveis
        float primeiraNota = 0;
        float primeiroPeso = 2;

        float segundaNota = 0;
        float segundoPeso = 2;

        float terceiraNota = 0;
        float terceiroPeso = 3;

        float numeradorDaMediaPonderada = 0;
        float denominadorDaMediaPonderadaada = 0;

        float mediaFinal = 0;
        float mediaDoCurso = 7.0f;
        float mediaReprovado = 3.0f;

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

        //calculos
        numeradorDaMediaPonderada = primeiraNota * primeiroPeso + segundaNota * segundoPeso + terceiraNota * terceiroPeso;
        denominadorDaMediaPonderadaada = primeiroPeso + segundoPeso + terceiroPeso;
        mediaFinal = numeradorDaMediaPonderada / denominadorDaMediaPonderadaada;
        //demonstração do resultado

        System.out.println("valor do numerador: %f\n" + numeradorDaMediaPonderada);
        System.out.println("valor do denominador: %f\n" + denominadorDaMediaPonderadaada);
        System.out.println("media do infeliz: %f\n" + mediaFinal);

        if (mediaFinal >= mediaDoCurso) {
            System.out.println("passou\n");
        } else if (mediaFinal < mediaReprovado) {
            System.out.println("perdeu\n");
        } else {
            System.out.println("prova final\n");
        }
    }
}
