#write a function that takes in a number, max, and returns the sum of all the even numbers fibonacchi numbers under max 
# e.g. max(100) = 44
# e.g. max(1000) = 798
# e.g. max(1000000) = 1089154
# e.g. max(5999999) = 4613732
# e.g. max(100000000000000) = 36361730124070
# e.g. max(6042305039240) = 2026369768940


#probably a better way to do this rn because man that array gets big 
def solution(max):
    # Type your solution here 
    # returns the sum of all even numbers less than max     
    lis = fib(max)
    sum = 0
    for item in lis: 
        if item%2 == 0 and item < max:
            sum = sum+item
    return sum

def fib(max):
    n = 1 
    n2 = 2 
    l = [n,n2]
    while (n2<max):
        temp = n+n2
        l.append(temp)
        n = n2 
        n2 = temp
    return l
   