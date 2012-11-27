/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declaração de variáveis
    float quantidade_de_fitas = 0;
    float valor_do_aluguel_de_uma_fita = 0;
    
    
    float porcentagem_da_multa_por_atraso = 0.1;                      //    10/100  = 10%
    float porcentagem_de_fitas_entregues_com_atraso = 0.1;            //    1/10
    float porcentagem_de_fitas_a_ser_compradas_para_reposicao= 0.1    //    1/10
    float procentagem_de_fitas_alugadas_por_mes = 0.3                 //    1/3
    float porcentagem_de_fitas_estragadas_ao_ano = 0.02               //    2/100 = 2%
    
  
    float meses_no_ano = 12;
    
    //solicitação do pedido
    printf("Informe a quantidade de fitas da locadora: ");    
    scanf("%f", &quantidade_de_fitas);

    printf("Informe o valor do aluguel de cada fita: ");    
    scanf("%f", &valor_do_aluguel_de_uma_fita);

    //calculos
    
    valor_base_de_fitas_alugadas_no_ano = quantidade_de_fitas * procentagem_de_fitas_alugadas_por_mes * meses_do_ano; 
    
    valor_arrecadado_de_multas_ao_ano = valor_base_de_fitas_alugadas_no_ano * porcentagem_de_fitas_entregues_com_atraso * porcentagem_da_multa_por_atraso;
    valor_arrecadado_de_multas_ao_mes = valor_arrecadado_de_multas_ao_ano / meses_do_ano;
    
    quantidade_de_fitas_estragadas_ao_ano = quantidade_de_fitas * porcentagem_de_fitas_estragadas_ao_ano;
    
    //demonstração do resultado
    
    printf("primeiro termo: %f\n", primeiro_termo);
    printf("segundo termo: %f\n", segundo_termo);
    printf("razao: %f\n", razao);
    printf("terceiro termo: %f\n", terceiro_termo);
    printf("progressao aritimetica %f %f %f\n", primeiro_termo, segundo_termo,  terceiro_termo);
    system("PAUSE");
    
    return 0;
}
