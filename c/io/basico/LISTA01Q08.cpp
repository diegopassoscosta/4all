/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declara��o de vari�veis
    float valor_da_conta = 0;
    float valor_da_gorgeta = 0;
    const float DEZ_PORCENTO = 0.1;
    float valor_total = 0;
    
    //solicita��o do pedido
    printf("Informe o valor da conta: ");    
    scanf("%f", &valor_da_conta);
    
    //calculos
    valor_da_gorgeta = (DEZ_PORCENTO) * valor_da_conta;
    valor_total = valor_da_conta + valor_da_gorgeta;
    
    //demonstra��o do resultado
    printf("valor da conta: %f\n", valor_da_conta);
    printf("valor da gorgeta: %f\n", valor_da_gorgeta);
    printf("porcentagem da gorgeta: %f\n", DEZ_PORCENTO);
    printf("valor do total da gorgeta: %f\n", valor_total);
    
    system("PAUSE");
    return 0;
}
