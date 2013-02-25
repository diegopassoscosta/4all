// Função : Preencher um vgetor manualmente
// Autor : Celso Barreto da Silva
// Data : 08/09/2002
algoritmo "Vetor_Preenchido"
var
   diegao : vetor[1..4] de inteiro
   x:inteiro
inicio
   limpatela
   para x <-1 ate 4 faca
      escreval("insira o numero: ",x," do vetor: ")
      leia(diegao[x])
   fimpara
      para x <-1 ate 4 faca
         escreval("os numeros do for é: ",diegao[x])
      fimpara
fimalgoritmo
