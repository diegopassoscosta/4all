/**
*@Autor Diego Passos Costa
*
*/
#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declaração de variáveis
    int hora = 0;
    int minuto = 0;
    int segundo = 0;
    
    int hora_em_segundo = hora*60*60;
    int minuto_em_segundo = minuto*60;
    int segundo_em_segundo = segundo;
    
    int tempo_total_de_segundos_do_dia = 0;

    //solicitação do pedido
    printf("Informe a(s) hora HH: ");    
    scanf("%d", &hora);
    printf("Informe o(s) minuto MM: ");    
    scanf("%d", &minuto);
    printf("Informe o(s) segundos SS: ");    
    scanf("%d", &segundo);

    //calculos
    hora_em_segundo = hora*60*60;
    minuto_em_segundo = minuto*60;
    segundo_em_segundo = segundo;
    
    //demonstração do resultado
    tempo_total_de_segundos_do_dia = hora_em_segundo + minuto_em_segundo + segundo_em_segundo;
    printf("Tempo total de segundo no dia e de: %d\n",tempo_total_de_segundos_do_dia);
    
    system("PAUSE");
    return 0;
}
