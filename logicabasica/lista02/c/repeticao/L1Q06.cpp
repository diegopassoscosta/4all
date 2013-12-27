/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    int numero = 0;
    int resultado = 1;
    
    printf("informe o numero: ");
    scanf("%d", &numero);
    for (int i = 5; i > 0; i--){
        resultado *= i;  
    }
    printf("%d", resultado);
    system("PAUSE");
}
