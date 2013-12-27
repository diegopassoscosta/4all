/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(void){

    //declaração de variáveis
    int primeiro_lado = 0;
    int segundo_lado = 0;
    int terceiro_lado = 0;
    
    //solicitação do pedido
    printf("Informe o primeiro lado: ");    
    scanf("%d", &primeiro_lado);

    printf("Informe o segundo lado: ");    
    scanf("%d", &segundo_lado);
    
    printf("Informe o terceiro lado: ");    
    scanf("%d", &terceiro_lado);

    //calculos
    // | b - c | < a < b + c
    if( ( (abs(segundo_lado - terceiro_lado)) < primeiro_lado) && (primeiro_lado < (segundo_lado + terceiro_lado) ) ){
        printf("E um triangulo: ");
        
        //verifica qual o tipo do triagulo
        //Equilatero 3 lados iguaus
        //Escaleno 3 lados diferentes
        //Isosceles dois lados iguais escolhido por exclusão
        if ( (primeiro_lado == segundo_lado) && (primeiro_lado == terceiro_lado) && (segundo_lado == terceiro_lado) ){
             printf("Equilatero\n");
        }else if ( (primeiro_lado != segundo_lado) && (primeiro_lado != terceiro_lado) && (segundo_lado != terceiro_lado) ){
              printf("Escaleno\n");            
        }else{
              printf("Isosceles\n");
        }
         
    }else{
          printf("Nao e um triangulo\n");
    }          
    system("PAUSE");
    
    return 0;
}
