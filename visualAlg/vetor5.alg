/ Algoritmo Vetor
// Função : Preencher um vgetor manualmente
// Autor : Celso Barreto da Silva
// Data : 08/09/2002
algoritmo "Vetor_Preenchido"
var
   dia_sem : vetor[1..7] de inteiro
   x:inteiro
inicio
   para x <-1 ate 7 faca
      escreva("insira o numero: ",x," do vetor: ")
      leia(dia_sem[x])
   fimpara
fimalgoritmo
