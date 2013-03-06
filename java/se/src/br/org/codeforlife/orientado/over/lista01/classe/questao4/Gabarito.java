/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.over.lista01.classe.questao4;

/**
 *
 * @author Diego Passos Costa
 */
public class Gabarito {

    public char respostaQuestao(int numeroQuestao) {

        char resposta;
        switch (numeroQuestao) {

            case 1:
                resposta = 'a';
                break;
            case 2:
                resposta = 'b';
                break;
            case 3:
                resposta = 'c';
                break;
            case 5:
                resposta = 'd';
                break;
            case 6:
                resposta = 'e';
                break;
            case 7:
                resposta = 'a';
                break;
            case 8:
                resposta = 'b';
                break;
            case 9:
                resposta = 'c';
                break;
            case 10:
                resposta = 'c';
                break;
            case 11:
                resposta = 'd';
                break;
            case 12:
                resposta = 'e';
                break;
            case 13:
                resposta = 'a';
                break;
            case 14:
                resposta = 'a';
                break;
            case 15:
                resposta = 'a';
                break;
            default:
                resposta = 'x';
                break;
        }

        return resposta;
        
    }
}
