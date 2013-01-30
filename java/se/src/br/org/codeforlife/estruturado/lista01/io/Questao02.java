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
public class Questao02 {

    public static void main(String args[]) {
        //declaração de variaveis
        int anos;
        int meses;
        int dias;

        int anosEmDias;
        int mesesEmDias;
        int diasEmDias;

        int totalDeDiasDeVida;

        Scanner leia = new Scanner(System.in);
        
        //coleta das informações
        System.out.println("Digite os anos de vida: ");
        anos = leia.nextInt();
        System.out.println("Digite so meses de vida: ");
        meses = leia.nextInt();
        System.out.println("Digite os dias de vida: ");
        dias = leia.nextInt();

        //calculos
        anosEmDias = anos * 365;
        mesesEmDias = meses * 30;
        diasEmDias = dias;
        totalDeDiasDeVida = anosEmDias + mesesEmDias + diasEmDias;

        //demonstração dos resultados
        System.out.println("Total de dias de vida \n" + totalDeDiasDeVida);

    }
}
