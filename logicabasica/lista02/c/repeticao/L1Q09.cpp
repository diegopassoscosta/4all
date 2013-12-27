/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){


    int numero = 0;
    int contador = 0;
    int resultado = 0;
    
    printf("informe o numero: ");
    scanf("%d", &numero);
    
    int i = 1;
    while( i <= numero ){      
        
        for (int j = 1; j <= i; j++){
            if (i % j == 0){
               ++contador;           
            }  
        }
    
        if (contador == 2){
           printf("%d e primo\n", i);             
        }
        contador = 0;
        ++i;
    }
       

    system("PAUSE");
    return 0;
}
