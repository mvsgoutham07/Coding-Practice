# Problem Statement: Given a number N, print its factors.
# Input Description:
# Input Size : n<=1000
# Sample Input: 6
# Sample Output: 1 2 3 6

def printFactors(n):
    factors = []
    for i in range(1, n+1):
        if (n%i==0):
            factors.append(i)
    print(*factors)

n = int(input())
printFactors(n)