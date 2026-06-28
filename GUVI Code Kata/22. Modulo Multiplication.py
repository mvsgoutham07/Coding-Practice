# Problem Statement: Given 3 numbers a,b,c print a*b mod c.
# Sample Input: 5 3 2
# Sample Output: 1

a, b, c = map(int, input().split())
result = (a*b)%c 
print(result)