/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(void){

    //declara��o de vari�veis
    int numero = 0;
    
    //solicita��o do pedido
    printf("Informe um numero: ");    
    scanf("%d", &numero);

    //calculos
    if( numero % 2 == 0){
        printf("E par\n");
    }else{
        printf("E impar\n");      
    }
              
    system("PAUSE");
    
    return 0;
}
