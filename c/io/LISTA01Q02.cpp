/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>


int main(void){
    
    //declaração de variaveis
    int anos = 0;
    int meses = 0;
    int dias= 0;
    
    int anos_em_dias = 0;
    int meses_em_dias = 0;
    int dias_em_dias = 0;
    
    int total_de_dias_de_vida = 0;
    
    //coleta das informações
    printf("Digite os anos de vida: ");    
    scanf("%d", &anos);
    printf("Digite so meses de vida: ");    
    scanf("%d", &meses);
    printf("Digite os dias de vida: ");
    scanf("%d", &dias);    
    
    //calculos
    anos_em_dias = anos * 365;
    meses_em_dias = meses * 30;
    dias_em_dias = dias;
    total_de_dias_de_vida = anos_em_dias + meses_em_dias + dias_em_dias;
    
    //demonstração dos resultados
    printf("Total de dias de vida %d\n", total_de_dias_de_vida);
    
    system("PAUSE");
    return 0;
}
    
