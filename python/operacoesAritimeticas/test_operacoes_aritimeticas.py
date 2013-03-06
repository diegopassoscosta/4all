import unittest
from operacoes_aritimeticas import *

class TestOperacoesAritimeticas(unittest.TestCase):

	def test_soma_entre_dois_valores_positivos(self):
		valor_1 = 25
		valor_2 = 25
		resultado = soma(valor_1, valor_2)
		self.assertEquals(resultado, valor_1 + valor_2)

	def test_subtracao_entre_dois_valores_positivos(self):
		valor_1 = 30
		valor_2 = 30
		resultado = subtracao(valor_1, valor_2)
		self.assertEquals(resultado, valor_1 - valor_2)

	def test_multiplicacao_entra_dois_valores_positivos(self):
		valor_1 = 100
		valor_2 = 7
		resultado = multiplicacao(valor_1, valor_2)
		self.assertEquals(resultado, valor_1 * valor_2)

	def test_divisao_entre_dois_valores_positivos(self):
		pass

if __name__ == '__main__':
	unittest.main()
