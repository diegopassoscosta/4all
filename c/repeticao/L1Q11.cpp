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
    int resultado = 0;
    
    printf("informe o primero numero: ");
    scanf("%d", &primeiro_numero);
    
    printf("informe o segundo numero: ");
    scanf("%d", &segundo_numero);
    
    for (int i = primeiro_numero; i <= segundo_numero; i++){      
        
        for (int j = 1; j <= i; j++){
            if (i % j == 0){
               ++contador;           
            }  
        }
    
        if (contador == 2){
           printf("%d e primo\n", i);             
        }
        contador = 0;
      
    }
       

    system("PAUSE");
    return 0;
}
