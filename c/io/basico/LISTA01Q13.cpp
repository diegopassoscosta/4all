#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declaração de variáveis
    float tempo_da_viagem = 0;
    float velocidade_media = 0;
    float kilometros_por_litro = 12;
    
    float litros_usados = 0;
    float diantancia_da_viagem = 0;
    
    
    //solicitação do pedido
    printf("Informe o tempo de viagem: ");    
    scanf("%f", &tempo_de_viagem);

    printf("Informe a velocidade media: ");    
    scanf("%f", &velocidade_media);
    

    //calculos
    distancia_da_viagem = velocidade_media * tempo_de_viagem; 
    litros_usados = distancia_da_viagem * kilometros_por_litro;
    
    //demonstração do resultado
    printf("litros usados: %f\n", litros_usados);
    system("PAUSE");
    
    return 0;
}
