/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declara��o de vari�veis
    float primeiro_termo = 0;
    float segundo_termo = 0;
    float terceiro_termo = 0;
    float razao = 0;
    
    //solicita��o do pedido
    printf("Informe a primeira valor: ");    
    scanf("%f", &primeiro_termo);

    printf("Informe o segundo valor: ");    
    scanf("%f", &segundo_termo);

    //calculos
    razao = segundo_termo - primeiro_termo;
    terceiro_termo = segundo_termo + razao;
    //demonstra��o do resultado
    
    printf("primeiro termo: %f\n", primeiro_termo);
    printf("segundo termo: %f\n", segundo_termo);
    printf("razao: %f\n", razao);
    printf("terceiro termo: %f\n", terceiro_termo);
    printf("progressao aritimetica %f %f %f\n", primeiro_termo, segundo_termo,  terceiro_termo);
    system("PAUSE");
    return 0;
}
