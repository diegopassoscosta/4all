/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>



int main(void){

    //declaração de variáveis
    float primeira_nota = 0;
    float primeiro_peso = 0;
    
    float segunda_nota = 0;
    float segundo_peso = 0;
    
    float terceira_nota = 0;
    float terceiro_peso = 0;
    
    float quarta_nota = 0;
    float quarto_peso = 0;
    
    
    float numerador_da_media_ponderada = 0;
    float denominador_da_media_ponderada = 0;
    
    float media_final = 0;
    float media_do_curso = 7.0;
    
    //solicitação do pedido
    printf("Informe a primeira nota: ");    
    scanf("%f", &primeira_nota);
    printf("Informe o primeiro peso: ");    
    scanf("%f", &primeiro_peso);
    
    printf("Informe a segunda nota: ");    
    scanf("%f", &segunda_nota);
    printf("Informe o segundo peso: ");    
    scanf("%f", &segundo_peso);
    
    printf("Informe a terceira nota: ");    
    scanf("%f", &terceira_nota);
    printf("Informe o terceiro peso: ");    
    scanf("%f", &terceiro_peso);
    
    printf("Informe a quarta nota: ");    
    scanf("%f", &quarta_nota);
    printf("Informe o quarto peso: ");    
    scanf("%f", &quarto_peso);
    
    //calculos
    numerador_da_media_ponderada = primeira_nota * primeiro_peso + segunda_nota * segundo_peso + terceira_nota * terceiro_peso + quarta_nota * quarto_peso;
    denominador_da_media_ponderada = primeiro_peso + segundo_peso + terceiro_peso + quarto_peso;
    media_final = numerador_da_media_ponderada/denominador_da_media_ponderada;
    //demonstração do resultado
    
    printf("valor do numerador: %f\n", numerador_da_media_ponderada);
    printf("valor do denominador: %f\n", denominador_da_media_ponderada);
    printf("media do infeliz: %f\n", media_final);
    
    if (media_final >= media_do_curso){
       printf("passou\n");
    }else{
          printf("perdeu\n");
    }             
    
    system("PAUSE");
    return 0;
}
