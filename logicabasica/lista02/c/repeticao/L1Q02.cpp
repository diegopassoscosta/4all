#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(void){

    //declaração de variáveis
    int primeiro_numero = 0;
    int segundo_numero = 0;
    int menor_numero = 0;
    int maior_numero = 0;
    
    //solicitação do pedido
    printf("Informe o primeiro numero: ");    
    scanf("%d", &primeiro_numero);

    printf("Informe o segundo numero: ");    
    scanf("%d", &segundo_numero);
    
    if (primeiro_numero < segundo_numero){
       menor_numero = primeiro_numero;
       maior_numero = segundo_numero;                    
    }else if (primeiro_numero > segundo_numero ) {
          menor_numero = segundo_numero;
          maior_numero = primeiro_numero;      
    }else{ // tanto faz sao iguais
          menor_numero = segundo_numero; 
          maior_numero = segundo_numero;       
    }

    //calculos
    for (; menor_numero <= maior_numero; menor_numero++){
       printf("%d\n", menor_numero);    
   }
              
    system("PAUSE");
    
    return 0;
}
