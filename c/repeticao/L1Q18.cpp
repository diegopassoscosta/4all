/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declaração das variáveis
    int numero = 0;
    int i = 1;
    int j = 0;
    int t = 0;
    int k = 0;
    bool continua = true;
    
    //solicitação das informações
    printf("informe o numero: ");
    scanf("%d",&numero);
    
    //calculos 
    for (k = 0; k <= numero; k++){
        t = i + j;
        i = j;
        j = t;
        if (j == numero){
           printf("pertence a sequencia de fibonacci\n");
        }
    }
       
    system("PAUSE");
    return 0;
}
