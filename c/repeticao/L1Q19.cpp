#include <stdio.h>
#include <stdlib.h>

int main(void){

    //declaração das variáveis
    
    float idade = 0;
    float sexo = 0;
    float genero = 0;
    
    float comedia = 0;
    float acao = 0;
    float terror = 0;
    
    float total_homens = 0;
    float total_mulheres = 0;
    
    float idade_pessoas_que_gostam_de_terror = 0;
    
    float homens_que_preferem_acao = 0;
    
    float homens_que_preferem_comedia = 0;
    float mulheres_que_preferem_comedia = 0;
    
    float numero_de_pessoas_entrevistadas = 0;
    
    int continua = 0;
    
    //solicitação das informações
    while (continua != -1){
          
          printf("informe a idade: ");
          scanf("%f", &idade);      
          
          printf("informe o sexo: (1) Masculino; (2) Feminino: ");
          scanf("%f", &sexo);
          
          printf("informe o Genero: (1) Comedia; (2)Acao; (3) Terror: ");
          scanf("%f", &genero);
          
          ++numero_de_pessoas_entrevistadas;
          
          //idade das pessoas que preferem filmes de terror
          if (genero == 3){
             idade_pessoas_que_gostam_de_terror = idade_pessoas_que_gostam_de_terror + idade;           
          }
          //percentual de homens que prefere filmes de ação
          if (sexo == 1 && genero == 2){
             ++homens_que_preferem_acao;           
          }
          //homens ou mais mulheres preferem os filmes de comédia
          if (genero == 1){
          
             if (sexo == 1){
                ++homens_que_preferem_comedia;
             }else if (sexo == 2){
                ++mulheres_que_preferem_comedia;   
             }  
          }
          
          //saida do loop
          printf("Deseja continuar? digite -1 para terminar: ");
          scanf("%d", &continua);
    }
    
    
    //demonstração dos resultados
    printf("média de idade das pessoas que preferem filmes de terror: %f\n",idade_pessoas_que_gostam_de_terror/numero_de_pessoas_entrevistadas);
    
    printf("percentual de homens que prefere filmes de ação: %f\n",homens_que_preferem_acao/numero_de_pessoas_entrevistadas);
    
    if (homens_que_preferem_comedia > mulheres_que_preferem_comedia){
       printf("Homens preferem comedia\n");                                
    }else if (homens_que_preferem_comedia < mulheres_que_preferem_comedia){
          printf("Mulheres preferem comedia\n");
    }else{
          printf("Empatou na comedia\n");
    }
    
    //fim do programa  
    system("PAUSE");
    return 0;
}
