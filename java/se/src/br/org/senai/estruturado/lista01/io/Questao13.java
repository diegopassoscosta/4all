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
public class Questao13 {

    public static void main(String args[]) {
        //declaração de variáveis
        float tempo_de_viagem = 0;
        float velocidade_media = 0;
        float kilometros_por_litro = 12;

        float litros_usados = 0;
        float distancia_da_viagem = 0;

        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe o tempo de viagem: ");
        tempo_de_viagem = leia.nextFloat();

        System.out.println("Informe a velocidade media: ");
        velocidade_media = leia.nextFloat();


        //calculos
        distancia_da_viagem = velocidade_media * tempo_de_viagem;
        litros_usados = distancia_da_viagem * kilometros_por_litro;

        //demonstração do resultado
        System.out.println("litros usados: \n" + litros_usados);

    }
}
