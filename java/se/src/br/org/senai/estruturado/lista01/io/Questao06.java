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
public class Questao06 {

    public static void main(String args[]) {
        //declaração de variáveis
        int hora;
        int minuto;
        int segundo;

        int hora_em_segundo;
        int minuto_em_segundo;
        int segundo_em_segundo;

        int tempo_total_de_segundos_do_dia;
        
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a(s) hora HH: ");
        hora = leia.nextInt();
        System.out.println("Informe o(s) minuto MM: ");
        minuto = leia.nextInt();
        System.out.println("Informe o(s) segundos SS: ");
        segundo = leia.nextInt();

        //calculos
        hora_em_segundo = hora * 60 * 60;
        minuto_em_segundo = minuto * 60;
        segundo_em_segundo = segundo;

        //demonstração do resultado
        tempo_total_de_segundos_do_dia = hora_em_segundo + minuto_em_segundo + segundo_em_segundo;
        System.out.println("Tempo total de segundo no dia e de: \n" + tempo_total_de_segundos_do_dia);

    }
}
