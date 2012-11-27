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
    printf("o troco e de: %d\n", valor_pago - valor_compra);
    system("PAUSE");
    return 0;
}
