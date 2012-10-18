/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    int numero = 0;
    int resultado = 0;
     
    for (int i = 0; i < 300; i++){      
        printf("informe um numero a ser somado: ");
        scanf("%d", &numero);
        resultado = resultado + numero;    
    }
       
    printf("soma total %d\n", resultado);

    system("PAUSE");
    return 0;
}
