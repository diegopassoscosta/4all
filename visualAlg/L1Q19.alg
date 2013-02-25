algoritmo "L1Q19"
// Função :
// Autor :
// Data : 08/05/2012
// 19.	Faça um algoritmo  que receba o valor total de uma compra, o valor pago
// e informe qual o troco a ser devolvido. Considere que o valor pago sempre
// será suficiente para pagar a compra.

// Seção de Declarações 
var
   valor_compra : inteiro
   valor_pago   : inteiro
inicio

    escreva("Informe o valor da compra: ")
    leia(valor_compra)
    escreva("informe o valor pago: ")
    leia(valor_pago)
    escreva("o troco e de: ", valor_pago - valor_compra)
fimalgoritmo
