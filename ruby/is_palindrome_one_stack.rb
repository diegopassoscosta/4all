require 'lineardslab.rb'
include LinearDSLab
include BitLab

def is_palindrome(v)
s = Stack.new
v.split(//).each { |x| s.push x }

result = ""
for i in 0..s.count-1
result = result + s.pop
end

return result == v
end