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
public class Questao06 {

    public static void main(String args[]) {
        //declaração de variáveis
        int hora;
        int minuto;
        int segundo;

        int horaEmSegundo;
        int minutoEmSegundo;
        int segundoEmSegundo;

        int tempoTotalDeSegundosDoDia;
        
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a(s) hora HH: ");
        hora = leia.nextInt();
        System.out.println("Informe o(s) minuto MM: ");
        minuto = leia.nextInt();
        System.out.println("Informe o(s) segundos SS: ");
        segundo = leia.nextInt();

        //calculos
        horaEmSegundo = hora * 60 * 60;
        minutoEmSegundo = minuto * 60;
        segundoEmSegundo = segundo;

        //demonstração do resultado
        tempoTotalDeSegundosDoDia = horaEmSegundo + minutoEmSegundo + segundoEmSegundo;
        System.out.println("Tempo total de segundo no dia e de: \n" + tempoTotalDeSegundosDoDia);

    }
}
