# Problem Statement: Given a number N, check whether it is prime or not. Print 'yes' if it is prime else print 'no'.
# Input Description: The input consists of a single integer N.
# Output Description: The output is 'yes' if N is prime, otherwise 'no'.
# Sample Input: 123
# Sample Output: no

def isPrime(n):
    if n<=1:
        return False
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    return True

n = int(input())
if isPrime(n):
    print("yes")
else:
    print("no")