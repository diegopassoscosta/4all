/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declara��o das vari�veis
    int numero = 0;
    int i = 1;
    int j = 0;
    int t = 0;
    int k = 0;
    bool continua = true;
    
    //solicita��o das informa��es
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
