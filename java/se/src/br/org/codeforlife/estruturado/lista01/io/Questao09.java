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
public class Questao09 {

    public static void main(String args[]) {
        //declaração de variáveis
        float primeiraNota = 0;
        float primeiroPeso = 0;

        float segundaNota = 0;
        float segundoPeso = 0;

        float terceiraNota = 0;
        float terceiroPeso = 0;

        float numeradorDaMediaPonderada = 0;
        float denominadorDaMediaPonderada = 0;
        
         Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a primeira nota: ");
        primeiraNota = leia.nextFloat();
        System.out.println("Informe o primeiro peso: ");
        primeiroPeso = leia.nextFloat();

        System.out.println("Informe a segunda nota: ");
        segundaNota = leia.nextFloat();
        
        System.out.println("Informe o segundo peso: ");
        segundoPeso = leia.nextFloat();

        System.out.println("Informe a terceira nota: ");
        terceiraNota = leia.nextFloat();
        
        System.out.println("Informe o terceiro peso: ");
        terceiroPeso = leia.nextFloat();

        //calculos
        numeradorDaMediaPonderada = primeiraNota * primeiroPeso + segundaNota * segundoPeso + terceiraNota * terceiroPeso;
        denominadorDaMediaPonderada = primeiroPeso + segundoPeso + terceiroPeso;
        //demonstração do resultado

        System.out.println("valor do numerador: \n" + numeradorDaMediaPonderada);
        System.out.println("valor do denominador: \n" + denominadorDaMediaPonderada);
        System.out.println("media do infeliz: \n"+ numeradorDaMediaPonderada / denominadorDaMediaPonderada);

       

    }
}
