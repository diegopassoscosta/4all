/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

/*
Faça um programa que receba os dois primeiros termos
 de uma progressão aritmética e mostre na tela os 10 primeiros termos da pa

*/

int main(void){

    int primeiro_termo = 0;
    int segundo_termo = 0;
    int proximo_termo = 0;
    int razao = 0;
    
    //solicitação do pedido
    printf("Informe a primeira valor: ");    
    scanf("%d", &primeiro_termo);

    printf("Informe o segundo valor: ");    
    scanf("%d", &segundo_termo);

    //calculos
    razao = segundo_termo - primeiro_termo;
   
    //demonstração do resultado
    printf("%d\n",primeiro_termo);
    printf("%d\n",segundo_termo);
    proximo_termo = segundo_termo + razao;
    for (int i = 0; i < 10; i++){
        proximo_termo = proximo_termo + razao;
        printf("%d\n", proximo_termo); 
    }
        
    system("PAUSE");
}
