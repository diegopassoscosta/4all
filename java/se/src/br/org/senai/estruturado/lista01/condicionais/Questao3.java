/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.estruturado.lista01.condicionais;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao3 {

    public static void main(String args[]) {

        //declaração de variáveis
        float primeira_nota;
        float primeiro_peso;

        float segunda_nota;
        float segundo_peso;

        float terceira_nota;
        float terceiro_peso;

        float quarta_nota;
        float quarto_peso;

        float numerador_da_media_ponderada;
        float denominador_da_media_ponderada;

        float media_final;
        float media_do_curso = 7.0f;
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a primeira nota: ");
        primeira_nota = leia.nextInt();
        System.out.println("Informe o primeiro peso: ");
        primeiro_peso = leia.nextInt();

        System.out.println("Informe a segunda nota: ");
        segunda_nota = leia.nextInt();
        System.out.println("Informe o segundo peso: ");
        segundo_peso = leia.nextInt();

        System.out.println("Informe a terceira nota: ");
        terceira_nota = leia.nextInt();
        System.out.println("Informe o terceiro peso: ");
        terceiro_peso = leia.nextInt();

        System.out.println("Informe a quarta nota: ");
        quarta_nota = leia.nextInt();
        System.out.println("Informe o quarto peso: ");
        quarto_peso = leia.nextInt();

        //calculos
        numerador_da_media_ponderada = primeira_nota * primeiro_peso + segunda_nota * segundo_peso + terceira_nota * terceiro_peso + quarta_nota * quarto_peso;
        denominador_da_media_ponderada = primeiro_peso + segundo_peso + terceiro_peso + quarto_peso;
        media_final = numerador_da_media_ponderada / denominador_da_media_ponderada;
        
        //demonstração do resultado
        System.out.println("valor do numerador: \n" + numerador_da_media_ponderada);
        System.out.println("valor do denominador: \n" + denominador_da_media_ponderada);
        System.out.println("media do infeliz: \n" + media_final);

        if (media_final >= media_do_curso) {
            System.out.println("passou\n");
        } else {
            System.out.println("perdeu\n");
        }

    }
}
