require 'test/unit'
require 'lista_desordenada'

class ListaTest < Test::Unit::TestCase
	#ok
	def teste_lista_intancia
		list = ListaDesordenada.new
		expected = ListaDesordenada.new.class
		result = list.class
		assert_not_nil(list)
		assert_equal(expected, result)
	end

	#ok
	def test_instace_variable_tam
		list = ListaDesordenada.new
		expected = 5
		result = list.tam
		assert_equal(expected, result)
	end
	
	#ok
	def test_instace_variable_inicio
		list = ListaDesordenada.new
		expected = 0
		result = list.inicio
		assert_equal(expected, result)
	end

	#ok
	def test_instace_variable_arranjo
		list = ListaDesordenada.new
		expected = [nil,nil,nil,nil,nil]
		result = list.arranjo
		assert_equal(expected, result)
	end

	#ok
	def test_lista_vazia
		list = ListaDesordenada.new
		expected = true
		result = list.isEmpty?
		assert_equal(expected, result)
	end

	def test_lista_cheia
		list = ListaDesordenada.new
		for i in 1..4
			list.insertElement i
		end		

		expected = [1,2,3,4,nil]
		result = list.arranjo
		assert_equal(expected,result)		
		
		expected = "-1-2-3-4-"
		result = list.printLista
		assert_equal(expected,result)		
		
	end

	def test_instace_variable_inicio_depois_de_removido
		list = ListaDesordenada.new
		list.insertElement 5
		list.insertElement 6
		
		expected = "-5-6-"
		result = list.printLista
		assert_equal(expected,result)

		expected = 0 # posicao -1
		result = list.inicio
		assert_equal(expected,result)
		
	end

	def test_instace_variable_fim_depois_de_inserido
		list = ListaDesordenada.new
		list.insertElement 5
		list.insertElement 6
		
		expected = "-5-6-"
		result = list.printLista
		assert_equal(expected,result)

		
		
	end

	def test_instace_variable_fim
		list = ListaDesordenada.new
		expected = 0
		result = list.fim
		assert_equal(expected, result)
	end

	def test_instace_variable_arranjo
		list = ListaDesordenada.new
		expected = [nil,nil,nil,nil,nil]
		result = list.arranjo
		assert_equal(expected, result)
	end

	
	def test_lista_insert
		list = ListaDesordenada.new
		expected = 34
		result = list.insertElement 34
		assert_equal(expected, result)
		
		expected = 35
		result = list.insertElement 35
		assert_equal(expected, result)

	end

	def test_lista_remove
		list = ListaDesordenada.new
		expected = 12
		list.insertElement 12
		result = list.removeElement
		assert_equal(expected, result)
		
	end

	
	def test_lista_remove_dois_elementos
		list = ListaDesordenada.new
		expected = 12
		list.insertElement 12
		list.insertElement 13
		result = list.removeElement
		assert_equal(expected, result)
		expected = 13
		result = list.removeElement
		assert_equal(expected, result)		
	end

	

	def test_lista_inserindo_sexto_elemento_depois_de_remover_o_quinto
		list = ListaDesordenada.new
		for i in 1..4
			list.insertElement i
		end

		expected = "-1-2-3-4-"
		result = list.printLista
		assert_equal(expected,result)

		result = list.removeElement
		expected = "-2-3-4-"
		result = list.printLista
		assert_equal(expected,result)

		list.insertElement 44

		expected = "-2-3-4-44-"
		result = list.printLista
		assert_equal(expected,result)
		
	end

	def test_print_lista
		list = ListaDesordenada.new
		for i in 1..4
			list.insertElement i
		end

		expected = "-1-2-3-4-"
		result = list.printLista
		assert_equal(expected,result)
	end


end
