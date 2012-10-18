/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declaração das variáveis
    float altura_tibroncio = 1.20;
    float altura_asdrubal = 1.05;
    float crescimento_tibroncio = 0.02;
    float crescimento_asdrubal = 0.03;
    int anos = 0;
     
    //calculos 
    while (altura_asdrubal < altura_tibroncio){
        altura_tibroncio = altura_tibroncio + crescimento_tibroncio;        
        altura_asdrubal = altura_asdrubal + crescimento_asdrubal;
        ++anos;
        
    }
    
    //demonstração dos resultados   
    printf("altura adrubal %2.2f\n", altura_asdrubal);
    printf("altura tibroncio %2.2f\n", altura_tibroncio);   
    printf("adrubal finalmente passou em %d anos\n", anos);

    system("PAUSE");
    return 0;
}
