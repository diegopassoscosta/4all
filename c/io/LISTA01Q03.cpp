/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>


int main(void){
    int centigrados = 0;
    printf("Informe o valor em Centigrados: ");    
    scanf("%d", &centigrados);
    printf("A conversao de Centigrados para Fahrenheit e: %d \n", ((9*centigrados)+160)/5 );
    system("PAUSE");
    return 0;
}
