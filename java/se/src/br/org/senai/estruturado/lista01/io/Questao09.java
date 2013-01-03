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
public class Questao09 {

    public static void main(String args[]) {
        //declaração de variáveis
        float primeira_nota = 0;
        float primeiro_peso = 0;

        float segunda_nota = 0;
        float segundo_peso = 0;

        float terceira_nota = 0;
        float terceiro_peso = 0;

        float numerador_da_media_ponderada = 0;
        float denominador_da_media_ponderada = 0;
        
         Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a primeira nota: ");
        primeira_nota = leia.nextFloat();
        System.out.println("Informe o primeiro peso: ");
        primeiro_peso = leia.nextFloat();

        System.out.println("Informe a segunda nota: ");
        segunda_nota = leia.nextFloat();
        
        System.out.println("Informe o segundo peso: ");
        segundo_peso = leia.nextFloat();

        System.out.println("Informe a terceira nota: ");
        terceira_nota = leia.nextFloat();
        
        System.out.println("Informe o terceiro peso: ");
        terceiro_peso = leia.nextFloat();

        //calculos
        numerador_da_media_ponderada = primeira_nota * primeiro_peso + segunda_nota * segundo_peso + terceira_nota * terceiro_peso;
        denominador_da_media_ponderada = primeiro_peso + segundo_peso + terceiro_peso;
        //demonstração do resultado

        System.out.println("valor do numerador: \n" + numerador_da_media_ponderada);
        System.out.println("valor do denominador: \n" + denominador_da_media_ponderada);
        System.out.println("media do infeliz: \n"+ numerador_da_media_ponderada / denominador_da_media_ponderada);

       

    }
}
