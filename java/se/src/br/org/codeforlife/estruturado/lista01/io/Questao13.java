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
public class Questao13 {

    public static void main(String args[]) {
        //declaração de variáveis
        float tempoDeViagem = 0;
        float velocidadeMedia = 0;
        float kilometrosPorLitro = 12;

        float litrosUsados = 0;
        float distanciaDaViagem = 0;

        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe o tempo de viagem: ");
        tempoDeViagem = leia.nextFloat();

        System.out.println("Informe a velocidade media: ");
        velocidadeMedia = leia.nextFloat();


        //calculos
        distanciaDaViagem = velocidadeMedia * tempoDeViagem;
        litrosUsados = distanciaDaViagem * kilometrosPorLitro;

        //demonstração do resultado
        System.out.println("litros usados: \n" + litrosUsados);

    }
}
