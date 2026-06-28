# Problem Statement: Given a number N, print the product of the digits.
# Input Description:
# Input Size : N <= 100000000000
# Sample Input: 2143
# Sample Output: 24

n = input().strip()
product = 1
for a in n:
    product *= int(a)
print(product)