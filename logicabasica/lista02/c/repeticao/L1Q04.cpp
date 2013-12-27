#include <stdio.h>
#include <stdlib.h>

/*

Faça um programa que receba a quantidade de alunos de uma turma e, em seguida,
para cada aluno, receba o nome e as quatro notas do aluno, calcule e mostre a média do aluno
e mostre na tela uma mensagem informando o resultado do aluno. Cada aluno receberá uma das seguintes mensagens:
a) Parabéns, nome_do_aluno, você foi aprovado. (média mínima 7.0)
b) Nome_do_aluno, apresente-se para a prova final. (média entre 4 e 6.9)
c) Nome_do_aluno, infelizmente você não atingiu a média mínima. (média abaixo de 4.0)

*/

int main(void){

    //declaração de variáveis
    float primeira_nota = 0;    
    float segunda_nota = 0;
    float terceira_nota = 0;
    float quarta_nota = 0;
    
    int numero_de_alunos = 0;

    float numerador_da_media_ponderada = 0;
    float denominador_da_media_ponderada = 4; // quantidade de provas
    
    float media_final = 0;
    float media_do_curso = 7.0;
    float media_reprovado = 4.0;
    
    //solicitação do pedido
    
    
    printf("Informe a quantidade de alunos: ");    
        scanf("%d", &numero_de_alunos);
        
    for (int i = 0; i < numero_de_alunos; i++){
        printf("Informe a primeira nota: ");    
        scanf("%f", &primeira_nota);
        
        printf("Informe a segunda nota: ");    
        scanf("%f", &segunda_nota);
        
        printf("Informe a terceira nota: ");    
        scanf("%f", &terceira_nota);
        
        printf("Informe a quarta nota: ");    
        scanf("%f", &quarta_nota);
        
        //calculos
        numerador_da_media_ponderada = primeira_nota + segunda_nota + terceira_nota + quarta_nota;
        media_final = numerador_da_media_ponderada/denominador_da_media_ponderada;
        //demonstração do resultado
        
        printf("valor do numerador: %f\n", numerador_da_media_ponderada);
        printf("valor do denominador: %f\n", denominador_da_media_ponderada);
        printf("media do infeliz: %f\n", media_final);
        
        if (media_final >= media_do_curso){
           printf("passou\n");
        }else if (media_final < media_reprovado){
              printf("perdeu\n");
        }else{
              printf("prova final\n");
        }             
    }
    
    system("PAUSE");
    return 0;
}
