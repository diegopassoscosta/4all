/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>


int main(void){
    float altura = 0.0;
    char sexo;
    
    
    printf("Informe a altura: ");    
    scanf("%f", &altura);
    
    printf("informe o sexo - m ou f: ");
    scanf(" %c", &sexo);
    
    if (sexo == 'm'){
       printf("o peso ideal e %f\n", (72.7 * altura) - 58);              
    }else if (sexo == 'f'){
          printf("o peso ideal e: %f\n", (62.1 * altura) - 44.7);
    }
    
    system("PAUSE");
    return 0;
}
