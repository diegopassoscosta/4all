/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    int numero = 0;
    int numero_atual = 0;
    int numero_anterior = 0;
    int primeiro_valor_digitado = 0;
    int contador = 0;
    bool continua = true;
     
    printf("informe o primeiro numero: ");
    scanf("%d", &primeiro_valor_digitado); 
    
    while (continua){     
        printf("informe um numero a ser somado: ");
        scanf("%d", &numero);
        numero_anterior = numero_atual;
        numero_atual = numero;
        ++contador;
        printf("contador %d\n",contador);
        if (contador == 2){
           if (primeiro_valor_digitado == ( numero_atual + numero_anterior) ) {
              continua = false;
              contador = 0;
              printf("aqui");
           }   
        }
        
        if (contador == 2){
           printf("atual %d anterior %d\n",numero_atual,numero_anterior);
           contador =0; 
        }
    }
       
    printf("saiu\n");

    system("PAUSE");
    return 0;
}
