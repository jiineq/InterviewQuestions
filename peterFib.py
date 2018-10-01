#all the greatest thanks to Peter for making me not garbage 
#I wish i could be like you one day

#0 1 2 3 4 5 6 7 8 9 10...
#0 1 1 2 3 5 8 13 21 34 55... if fib(0) = 0, fib(9) = 34
#1 1 2 3 5 8 13 21 34 55 89...if fib(0) = 1, fib(9) = 55 -__- according to wiki both are valid 

#fib(0) = 0
#fib(1) = 1
#finds the Nth fib iteratively
def fibIterative(n): 
	f = 0 
	s = 1
	i = 0
	while (i < n):
		temp = f
		f = s
		s = temp + s 
		i+=1
	return f

#fib(0) = 0
#fib(1) = 1
#finds the Nth fib recursively
def fibRecursive(n):
	if n==0: return 0
	if n==1: return 1
	return fibRecursive(n-1) + fibRecursive(n-2)

#fib(0) = 0
#fib(1) = 1
#finds the Nth fib recursively with dynamic programming 
def fibDP(n):
	if n==0: return 0
	if n==1: return 1
	arr = [-1 for i in range(n+1)]
	if (n not in arr):
		arr[n] = fibDP(n-1) + fibDP(n-2)
	return arr[n]

print (fibIterative(9))
print (fibRecursive(9))
print (fibDP(9))