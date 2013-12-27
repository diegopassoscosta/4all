/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    int numero = 0;
    int resultado_1 = 0;
    int resultado_2 = 0;
    int resultado_3 = 0;
    int contador = 0;
     
    printf("informe um numero limite: ");
    scanf("%d", &numero);
         
    for (int i = 1; i < numero; i++){
        resultado_1 = resultado_1 + 1/i;      
    }

    for (int i = 1; i < numero; i++){
        
        if ( i % 2 != 0){
           resultado_3 = resultado_3 + 1/i;
        }else{
             resultado_3 = resultado_3 - 1/i;
        }
                   
    }
       
    printf("s1 = %d\n", resultado_1);
    printf("s2 = %d\n", resultado_2);
    printf("s3 = %d\n", resultado_3);

    system("PAUSE");
    return 0;
}
