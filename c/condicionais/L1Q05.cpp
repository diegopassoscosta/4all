/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>


int main(void){
    int valor_compra = 0;
    int valor_pago = 0;
    printf("Informe o valor da compra: ");    
    scanf("%d", &valor_compra);
    printf("informe o valor pago: ");
    scanf("%d", &valor_pago);
    
    if (valor_pago < valor_compra){
       printf("valor insuficiente falta %d\n", valor_compra - valor_pago);              
    }else if (valor_pago > valor_compra){
          printf("o troco e de: %d\n", valor_pago - valor_compra);
    }else{
          printf("valor exato\n");
    }
    
    system("PAUSE");
    return 0;
}
