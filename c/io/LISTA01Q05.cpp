/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declaração de variáveis
    int valor_a_retirar = 0;
    int resto_de_50 = 0;
    int resto_de_10 = 0;
    int resto_de_5 = 0;
    int resto_de_1 = 0;
    
    int quantidade_de_notas_de_50;
    int quantidade_de_notas_de_10;
    int quantidade_de_notas_de_5;
    int quantidade_de_notas_de_1;
    
    //solicitação do pedido
    printf("Informe o valor a ser retirado do caixa eletronico: ");    
    scanf("%d", &valor_a_retirar);
    
    //calculos
    quantidade_de_notas_de_50 = valor_a_retirar / 50;
    resto_de_50 =  valor_a_retirar % 50;
    
    quantidade_de_notas_de_10 = resto_de_50 / 10;
    resto_de_10 = valor_a_retirar %10;
    
    quantidade_de_notas_de_5 = resto_de_10 / 5;
    resto_de_5 = valor_a_retirar % 5;
    
    quantidade_de_notas_de_1 = resto_de_5 / 1;
    
    //demonstração do resultado
    printf("Numero de cedulas de 50 %d\n", quantidade_de_notas_de_50);
    printf("Numero de cedulas de 10 %d\n", quantidade_de_notas_de_10);
    printf("Numero de cedulas de 5 %d\n", quantidade_de_notas_de_5);
    printf("Numero de cedulas de 1 %d\n", quantidade_de_notas_de_1);
    
    
    system("PAUSE");
    return 0;
}
