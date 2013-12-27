/**
*@Autor Diego Passos Costa
*
*/#include <stdio.h>
#include <stdlib.h>

int main(void){

    int numero = 0;
    int contador = 0;
    int resultado = 0;
    
    printf("informe o numero: ");
    scanf("%d", &numero);
    
    for (int i = 1; i <= numero; i++){
        if (numero % i == 0){
           ++contador;           
        }  
    }
    
    if (contador == 2){
       printf("primo\n");             
    }

    system("PAUSE");
}
