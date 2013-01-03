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
public class Questao02 {

    public static void main(String args[]) {
        //declaração de variaveis
        int anos;
        int meses;
        int dias;

        int anos_em_dias;
        int meses_em_dias;
        int dias_em_dias;

        int total_de_dias_de_vida;

        Scanner leia = new Scanner(System.in);
        
        //coleta das informações
        System.out.println("Digite os anos de vida: ");
        anos = leia.nextInt();
        System.out.println("Digite so meses de vida: ");
        meses = leia.nextInt();
        System.out.println("Digite os dias de vida: ");
        dias = leia.nextInt();

        //calculos
        anos_em_dias = anos * 365;
        meses_em_dias = meses * 30;
        dias_em_dias = dias;
        total_de_dias_de_vida = anos_em_dias + meses_em_dias + dias_em_dias;

        //demonstração dos resultados
        System.out.println("Total de dias de vida \n" + total_de_dias_de_vida);

    }
}
