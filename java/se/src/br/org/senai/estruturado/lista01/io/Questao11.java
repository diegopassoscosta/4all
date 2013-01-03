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
public class Questao11 {

    public static void main(String args[]) {
        //declaração de variáveis
        float quantidade_de_fitas = 0;
        float valor_do_aluguel_de_uma_fita = 0;


        float porcentagem_da_multa_por_atraso = 0.1f;                      //    10/100  = 10%
        float porcentagem_de_fitas_entregues_com_atraso = 0.1f;            //    1/10
        float porcentagem_de_fitas_a_ser_compradas_para_reposicao = 0.1f;  //    1/10
        float procentagem_de_fitas_alugadas_por_mes = 0.33f;               //    1/3
        float porcentagem_de_fitas_estragadas_ao_ano = 0.02f;              //    2/100 = 2%
        float valor_base_de_fitas_alugadas_no_ano;
        float valor_arrecadado_de_multas_ao_ano;
        float valor_arrecadado_de_multas_ao_mes;
        float quantidade_de_fitas_estragadas_ao_ano;
        float quantidade_de_fitas_depois_da_reposicao;
                
        float meses_do_ano = 12;
        
        Scanner leia = new Scanner(System.in);

        //solicitação do pedido
        System.out.println("Informe a quantidade de fitas da locadora: ");
        quantidade_de_fitas = leia.nextFloat();

        System.out.println("Informe o valor do aluguel de cada fita: ");
        valor_do_aluguel_de_uma_fita = leia.nextFloat();
       
        //calculos
        valor_base_de_fitas_alugadas_no_ano = quantidade_de_fitas * procentagem_de_fitas_alugadas_por_mes * meses_do_ano;
        
        valor_arrecadado_de_multas_ao_ano = valor_base_de_fitas_alugadas_no_ano * porcentagem_de_fitas_entregues_com_atraso * meses_do_ano;
        valor_arrecadado_de_multas_ao_mes = valor_arrecadado_de_multas_ao_ano / meses_do_ano;
        
        quantidade_de_fitas_estragadas_ao_ano = quantidade_de_fitas * porcentagem_de_fitas_estragadas_ao_ano;
        quantidade_de_fitas_depois_da_reposicao = quantidade_de_fitas + quantidade_de_fitas * porcentagem_de_fitas_a_ser_compradas_para_reposicao;

        //demonstração do resultado

        System.out.println("Faturamento anual: \n" + valor_base_de_fitas_alugadas_no_ano);
        System.out.println("Ganho com multas no ano: \n" + valor_arrecadado_de_multas_ao_ano);
        System.out.println("Ganho com multas no mes: \n" + valor_arrecadado_de_multas_ao_mes);
        System.out.println("Fitas estragadas no ano: \n" + quantidade_de_fitas_estragadas_ao_ano);
        System.out.println("Fitas total depois da reposição no ano: \n" + quantidade_de_fitas_depois_da_reposicao + quantidade_de_fitas);
        

    }
}
