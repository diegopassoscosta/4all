class ListaDesordenada

	attr_reader :tam
	attr_reader :inicio
	attr_reader :fim
	attr_reader :arranjo

	def initialize
		@tam = 5
		@inicio = 0
		@fim = @inicio
		@arranjo = [nil, nil, nil, nil, nil]
	end

	def isEmpty?
		return @inicio == @fim
	end

	def isFull? 
		if (@fim+1) % @tam == @inicio
			return true
		else
			return false
		end
	end

	def insertElement(x)
		if isFull?
			raise 'Lista Cheia'
		else
			@arranjo[@fim] = x
			@fim = (@fim+1) % @tam
		end
		return x
        
	end

	def removeElement
		element = -1
		if isEmpty?
			raise 'Exception---Fila Vazia'
		else
			element = @arranjo[@inicio]
			@arranjo[@inicio] = nil
			@inicio = (@inicio+1) % @tam
		end
		return element
        
	end

	def printLista
		lista = "-"
		i = @inicio
		while i != @fim
			lista += arranjo[i].to_s + "-"
			i = (i + 1) % tam
		end
		return lista
	end



end