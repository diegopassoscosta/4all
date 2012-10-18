/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void){

    //declaração de variáveis
    float x1 = 0;
    float y1 = 0;
    
    float x2 = 0;
    float y2 = 0;
    
    float distancia_entre_dois_pontos = 0;
    
    //solicitação do pedido
    printf("Informe o X1: ");    
    scanf("%f", &x1);

    printf("Informe o Y1: ");    
    scanf("%f", &y1);
    
    printf("Informe o X2: ");    
    scanf("%f", &x2);

    printf("Informe o Y2: ");    
    scanf("%f", &y2);


    //calculos
    
    distancia_entre_dois_pontos = sqrt( pow( (x2 - x1), 2) + pow ( (y2 - y1),2) );
    
    //demonstração do resultado
    
    printf("Distancia entre dois Pontos: %f\n", distancia_entre_dois_pontos);
    system("PAUSE");
    
    return 0;
}
