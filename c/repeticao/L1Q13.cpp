/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    int numero = 0;
    int resultado = 0;
     
    while (numero != -1){
        printf("informe um numero a ser somado: ");
        scanf("%d", &numero);
        if (numero != -1){
           resultado = resultado + numero;
        }    
    }
       
    printf("soma total %d\n", resultado);

    system("PAUSE");
    return 0;
}
