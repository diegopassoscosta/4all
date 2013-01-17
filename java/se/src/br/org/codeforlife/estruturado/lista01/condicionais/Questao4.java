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
        float primeira_nota = 0;
        float primeiro_peso = 2;

        float segunda_nota = 0;
        float segundo_peso = 2;

        float terceira_nota = 0;
        float terceiro_peso = 3;

        float numerador_da_media_ponderada = 0;
        float denominador_da_media_ponderada = 0;

        float media_final = 0;
        float media_do_curso = 7.0f;
        float media_reprovado = 3.0f;

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

        //calculos
        numerador_da_media_ponderada = primeira_nota * primeiro_peso + segunda_nota * segundo_peso + terceira_nota * terceiro_peso;
        denominador_da_media_ponderada = primeiro_peso + segundo_peso + terceiro_peso;
        media_final = numerador_da_media_ponderada / denominador_da_media_ponderada;
        //demonstração do resultado

        System.out.println("valor do numerador: %f\n" + numerador_da_media_ponderada);
        System.out.println("valor do denominador: %f\n" + denominador_da_media_ponderada);
        System.out.println("media do infeliz: %f\n" + media_final);

        if (media_final >= media_do_curso) {
            System.out.println("passou\n");
        } else if (media_final < media_reprovado) {
            System.out.println("perdeu\n");
        } else {
            System.out.println("prova final\n");
        }
    }
}
