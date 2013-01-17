/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.sintaxe.switchcase;

import java.util.Scanner;

/**
 *
 * @author lab01
 */
public class SwitchCase {
    
    public static void main(String args[]){


    char mes = 12;
        String mesString;
        switch (mes) {
            case 1:  mesString = "Janeiro";
                     break;
            case 2:  mesString = "Fevereiro";
                     break;
            case 3:  mesString = "Março";
                     break;
            case 4:  mesString = "Abril";
                     break;
            case 5:  mesString = "Maio";
                     break;
            case 6:  mesString = "Junho";
                     break;
            case 7:  mesString = "Julho";
                     break;
            case 8:  mesString = "Agosto";
                     break;
            case 9:  mesString = "Setembro";
                     break;
            case 10: mesString = "Outubro";
                     break;
            case 11: mesString = "Novembro";
                     break;
            case 12: mesString = "Dezembro";
                     break;
            default: mesString = "Mês inválido";
                     break;
        }
        System.out.println(mesString);
    
    }
    
}
