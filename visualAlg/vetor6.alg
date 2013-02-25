/ Algoritmo Vetor
// Função : Preencher um vgetor manualmente
// Autor : Celso Barreto da Silva
// Data : 08/09/2002
algoritmo "Vetor_Preenchido"
var
   dia_sem : vetor[1..7] de inteiro
   x,j:inteiro
inicio
   limpatela
   para j <-1 ate 45 faca
      escreva("#")
   fimpara
   para x <-1 ate 7 faca
      escreval("")
      escreval("insira o numero: ",x," do vetor: ")
      leia(dia_sem[x])
   fimpara
   para j <-1 ate 45 faca
      escreva("#")
   fimpara
fimalgoritmo
