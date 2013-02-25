algoritmo "L1Q18"
// Função :
// Autor :
// Data : 08/05/2012
// 18.)	Faça um algoritmo que receba uma temperatura em centígrados
//      e transforme para fahrenheit. Sabe-se que a fórmula para conversão
//      é F=((9xCentigrados)+160)/5. Ou seja, você deve fazer o computador
//      pedir apenas o valor da variável que falta no caso centigrado e
//      imprima o resultado na tela.

// Seção de Declarações 
var
   centigrado  : real
inicio
      escreva("Informe o centigrado: ")
      leia(centigrado)
      escreva(((9*centigrado)+160)/5)
fimalgoritmo
