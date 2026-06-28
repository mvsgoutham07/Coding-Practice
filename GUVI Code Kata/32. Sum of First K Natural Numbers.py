# Problem Statement: Write a program to print the sum of the first K natural numbers.
# Input Description: 
# Input Size : n <= 100000
# Sample Input: 3
# Sample Output: 6

n = int(input())
sum = 0
for i in range(1, n+1):
    sum += i 
print(sum)