# Problem Statement: Given a range of 2 numbers (i.e) L and R count the number of prime numbers in the range (inclusive of L and R ).
# Input Description:
# Input Size : L <= R <= 100000(complexity O(n) read about Sieve of Eratosthenes)
# Sample Input: 2 5
# Sample Output: 3

l, r = map(int, input().split())
count = 0
for i in range (l, r+1):
    if i<2:
        continue
    isPrime = True
    for j in range(2, i):
        if (i%j==0):
            isPrime = False
            break 
    if isPrime:
        count += 1
print(count)