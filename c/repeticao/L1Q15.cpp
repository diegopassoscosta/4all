/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    int numero = 0;
    int resultado_par = 0;
    int resultado_impar =0;
    int contador_par = 0;
    int contador_impar = 0;
     
    while (contador_par < 10){
        printf("informe um numero a ser somado: ");
        scanf("%d", &numero);
        if (numero % 2 == 0){
           resultado_par = resultado_par + numero;
           ++contador_par;
        }else{
           resultado_impar = resultado_impar + numero;
           ++contador_impar;   
        }    
    }
       
    printf("resultado par %d\n", resultado_par);
    printf("resultado impar %d\n", resultado_impar/contador_impar);

    system("PAUSE");
    return 0;
}
