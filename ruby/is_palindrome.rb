require 'lineardslab.rb'
include LinearDSLab
include BitLab

def is_palindrome(v)
t = v.split(//)
count = 0
result = false

q = Queue.new
s = Queue.new


for x in 0..t.length-1
 q.enqueue(t[x])
end

(t.length-1).downto(0){ |x| s.enqueue(t[x])}

max = q.count

while q.count > 0
  if q.dequeue == s.dequeue
    count = count + 1
  end
end
if count == max
 result = true
else
 result = false
end
return result
end