/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.senai.estruturado.lista01.repeticoes;

import java.util.Scanner;

/**
 *
 * @author Diego Passos Costa
 */
public class Questao20 {
    
    public static void main(String args[]){
      //declaração das variáveis
    
    Scanner leia = new Scanner(System.in);
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
          
          System.out.println("informe a idade: ");
          idade = leia.nextFloat();      
          
          System.out.println("informe o sexo: (1) Masculino; (2) Feminino: ");
          sexo = leia.nextFloat();
          
          System.out.println("informe o Genero: (1) Comedia; (2)Acao; (3) Terror: ");
          genero = leia.nextFloat();
          
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
          System.out.println("Deseja continuar? digite -1 para terminar: ");
          continua= leia.nextInt();
    }
    
    
    //demonstração dos resultados
    System.out.println("média de idade das pessoas que preferem filmes de terror: " + idade_pessoas_que_gostam_de_terror/numero_de_pessoas_entrevistadas);
    
    System.out.println("percentual de homens que prefere filmes de ação: " + homens_que_preferem_acao/numero_de_pessoas_entrevistadas);
    
    if (homens_que_preferem_comedia > mulheres_que_preferem_comedia){
       System.out.println("Homens preferem comedia");                                
    }else if (homens_que_preferem_comedia < mulheres_que_preferem_comedia){
          System.out.println("Mulheres preferem comedia");
    }else{
          System.out.println("Empatou na comedia");
    }
    
    }  
}
