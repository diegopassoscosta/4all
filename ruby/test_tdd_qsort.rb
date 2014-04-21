require 'test/unit'
require 'qsort'

class QsortTest < Test::Unit::TestCase

	def teste_qsort
		list = [5,4,3,2,1]
		expected = [1,2,3,4,5]
		result = quickSort(list)
		assert_equal(expected, result)
	end

end
