def quickSort(arr, l = 0, h = arr.length-1)
    #int stack[ h - l + 1 ];
    stack = Stack.new
     
    #push initial values of l and h to stack
    stack.push l
    stack.push h
 
    #Keep popping from stack while is not empty
    while ( top >= 0 )
    {
        // Pop h and l
        h = stack[ top-- ];
        l = stack[ top-- ];
 
        // Set pivot element at its correct position in sorted array
        int p = partition( arr, l, h );
 
        // If there are elements on left side of pivot, then push left
        // side to stack
        if ( p-1 > l )
        {
            stack[ ++top ] = l;
            stack[ ++top ] = p - 1;
        }
 
        // If there are elements on right side of pivot, then push right
        // side to stack
        if ( p+1 < h )
        {
            stack[ ++top ] = p + 1;
            stack[ ++top ] = h;
        }
    }
end


def swap(a, b)
	t = a
	a = b
	b = a
	return a, b
end

def partition (arr, l, h)
x = arr[h]
i = l-1

max = h-1
for i in l..max
	if arr[j] <=x
		i = i + 1
		swap(a[i],a[j])

end