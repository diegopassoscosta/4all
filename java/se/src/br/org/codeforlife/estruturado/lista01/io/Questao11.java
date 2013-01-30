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
public class Questao11 {

    public static void main(String args[]) {
        //declaração de variáveis
        float quantidadeDeFitas = 0;
        float valorDoAluguelDeUmaFita = 0;


        float porcentagemDaMultaPorAtraso = 0.1f;                      //    10/100  = 10%
        float porcentagemDeFitasEntreguesComAtraso = 0.1f;            //    1/10
        float porcentagemDeFitasASerCompradasParaReposicao = 0.1f;  //    1/10
        float procentagemDeFitasAlugadasPorMes = 0.33f;               //    1/3
        float porcentagemDeFitasEstragadasAoAno = 0.02f;              //    2/100 = 2%
        float valorBaseDeFitasAlugadasNoAno;
        float valorArrecadadoDeMultasAoAno;
        float valorArrecadadoDeMultasAoMes;
        float quantidadeDeFitasEstragadasAoAno;
        float quantidadeDeFitasDepoisDaReposicao;
                
        float meses_do_ano = 12;
        
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a quantidade de fitas da locadora: ");
        quantidadeDeFitas = leia.nextFloat();

        System.out.println("Informe o valor do aluguel de cada fita: ");
        valorDoAluguelDeUmaFita = leia.nextFloat();
       
        //calculos
        valorBaseDeFitasAlugadasNoAno = quantidadeDeFitas * procentagemDeFitasAlugadasPorMes * meses_do_ano;
        
        valorArrecadadoDeMultasAoAno = valorBaseDeFitasAlugadasNoAno * porcentagemDeFitasEntreguesComAtraso * meses_do_ano;
        valorArrecadadoDeMultasAoMes = valorArrecadadoDeMultasAoAno / meses_do_ano;
        
        quantidadeDeFitasEstragadasAoAno = quantidadeDeFitas * porcentagemDeFitasEstragadasAoAno;
        quantidadeDeFitasDepoisDaReposicao = quantidadeDeFitas + quantidadeDeFitas * porcentagemDeFitasASerCompradasParaReposicao;

        //demonstração do resultado

        System.out.println("Faturamento anual: \n" + valorBaseDeFitasAlugadasNoAno);
        System.out.println("Ganho com multas no ano: \n" + valorArrecadadoDeMultasAoAno);
        System.out.println("Ganho com multas no mes: \n" + valorArrecadadoDeMultasAoMes);
        System.out.println("Fitas estragadas no ano: \n" + quantidadeDeFitasEstragadasAoAno);
        System.out.println("Fitas total depois da reposição no ano: \n" + quantidadeDeFitasDepoisDaReposicao + quantidadeDeFitas);
        

    }
}
