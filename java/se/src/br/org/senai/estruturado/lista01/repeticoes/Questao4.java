/*
 *   Faça um programa que receba a quantidade de alunos de uma turma e, em seguida,
 *para cada aluno, receba o nome e as quatro notas do aluno, calcule e mostre a média do aluno
 *e mostre na tela uma mensagem informando o resultado do aluno. Cada aluno receberá uma das seguintes mensagens:
 *a) Parabéns, nome_do_aluno, você foi aprovado. (média mínima 7.0)
 *b) Nome_do_aluno, apresente-se para a prova final. (média entre 4 e 6.9)
 *c) Nome_do_aluno, infelizmente você não atingiu a média mínima. (média abaixo de 4.0)
 *
 */
package br.org.senai.estruturado.lista01.repeticoes;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao4 {

    public static void main(String args[]) {

        //declaração de variáveis
        float primeira_nota = 0;
        float segunda_nota = 0;
        float terceira_nota = 0;
        float quarta_nota = 0;

        int numero_de_alunos = 0;

        float numerador_da_media_ponderada = 0;
        float denominador_da_media_ponderada = 4; // quantidade de provas

        float media_final = 0;
        float media_do_curso = 7;
        float media_reprovado = 4;

        Scanner leia = new Scanner(System.in);

        //solicitação do pedido


        System.out.println("Informe a quantidade de alunos: ");
        numero_de_alunos = leia.nextInt();

        for (int i = 0; i < numero_de_alunos; i++) {
            System.out.println("Informe a primeira nota: ");
            primeira_nota = leia.nextFloat();

            System.out.println("Informe a segunda nota: ");
            segunda_nota = leia.nextFloat();

            System.out.println("Informe a terceira nota: ");
            terceira_nota = leia.nextFloat();

            System.out.println("Informe a quarta nota: ");
            quarta_nota = leia.nextFloat();

            //calculos
            numerador_da_media_ponderada = primeira_nota + segunda_nota + terceira_nota + quarta_nota;
            media_final = numerador_da_media_ponderada / denominador_da_media_ponderada;
            //demonstração do resultado

            System.out.println("valor do numerador: " + numerador_da_media_ponderada);
            System.out.println("valor do denominador: " + denominador_da_media_ponderada);
            System.out.println("media do infeliz: "+ media_final);

            if (media_final >= media_do_curso) {
                System.out.println("passou");
            } else if (media_final < media_reprovado) {
                System.out.println("perdeu");
            } else {
                System.out.println("prova final");
            }

        }
    }
}
