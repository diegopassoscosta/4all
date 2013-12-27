/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdio.h>
#include <stdlib.h>

int main(void){


    int primeiro_numero = 0;
    int segundo_numero = 0;
    int contador = 0;
    int resultado = 1;
    
    printf("informe o primero numero: ");
    scanf("%d", &primeiro_numero);
    
    printf("informe o segundo numero: ");
    scanf("%d", &segundo_numero);
    
    for (int i = primeiro_numero; i <= segundo_numero; i++){      
    
        if (i % 2 == 0){
        
           for (int j = i; j > 0; j--){
               resultado *= j;  
           }
           printf("fatorial de %d e %d\n", i, resultado);
           resultado = 1;       
        }
      
    }
       

    system("PAUSE");
    return 0;
}
