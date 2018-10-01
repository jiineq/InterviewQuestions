#given a grid size n x m find the total number of paths if paths can only go in one direction from x to y
'''
e.g. 3x4 grid, can only go right and down  

x_____________
|  |  |  |  |
-------------
|  |  |  |  |
-------------
|  |  |  |  |
------------- y


'''

#solve iteratively 
#omg u r dumb did you forget your combo
#total number of steps is always n+m 
#so since every path is n+m steps then choose n to be vert or m to b ehori
#so c(n+m, n) or c(n+m, m)
def pathIt(n,m):
	npmFactorial = 1
	nFactorial = 1 
	mFactorial = 1
	for i in range(1,n+m+1):
		npmFactorial *=i
	for j in range(1,n+1):
		nFactorial *= j 
	for k in range(1,m+1):
		mFactorial *= k
	return npmFactorial/(nFactorial*mFactorial)

#exponential 
#solve recurively 
def pathRecur(n,m):
	if n==0: return 1
	if m==0: return 1
	return pathRecur(n,m-1)+pathRecur(n-1,m)


#solve dynamic programming 
def pathDP(n,m):   
	if n==0: return 1
	if m==0: return 1

	d = {}
	if (n,m) not in d: 
		d[(n,m)] = pathDP(n-1,m) + pathDP(n, m-1)
		return pathDP((n-1),m) + pathDP(n, m-1)
	else:
		return d.get((n,m))


print (pathIt(6,4))
print(pathRecur(6,4))
print(pathDP(3,2))

