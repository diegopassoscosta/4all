#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declara��o de vari�veis
    int primeiro_numero = 0;
    int segundo_numero = 0;
    
    //solicita��o do pedido
    printf("Informe o primeiro numero: ");    
    scanf("%d", &primeiro_numero);

    printf("Informe o segundo numero: ");    
    scanf("%d", &segundo_numero);
    
    //calculos
    for (; primeiro_numero <= segundo_numero; primeiro_numero++){
       printf("%d\n", primeiro_numero);    
   }
              
    system("PAUSE");
    
    return 0;
}
