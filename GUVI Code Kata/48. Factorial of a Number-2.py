# Problem Statement: Given a number N, find the factorial of N.
# Input Description: The input consists of a single integer N, constrained by 1 <= N <= 25.
# Output Description: The output is the calculated factorial of N.
# Sample Input: 5
# Sample Output: 120

def factorial(n):
    if n==0 or n==1:
        return 1
    return n*factorial(n-1)
a = int(input())
print(factorial(a))