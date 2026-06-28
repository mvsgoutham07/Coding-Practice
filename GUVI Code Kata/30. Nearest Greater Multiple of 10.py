# Problem Statement: Given a number N, find the nearest greater multiple of 10.
# Input Description:
# Input Size : N <= 10000
# Sample Input: 3
# Sample Output: 10

n = int(input())
s = ((n//10) + 1)*10
print(s)