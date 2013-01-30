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
public class Questao12 {

    public static void main(String args[]) {
        //declaração de variáveis
        float x1 = 0;
        float y1 = 0;

        float x2 = 0;
        float y2 = 0;

        float distanciaEntreDoisPontos = 0;
        
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe o X1: ");
        x1 = leia.nextFloat();

        System.out.println("Informe o Y1: ");
        y1 = leia.nextFloat();

        System.out.println("Informe o X2: ");
        x2 = leia.nextFloat();

        System.out.println("Informe o Y2: ");
        y2 = leia.nextFloat();;

        //calculos
        distanciaEntreDoisPontos = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        //demonstração do resultado
        System.out.println("Distancia entre dois Pontos: " + distanciaEntreDoisPontos);
        
    }
}
