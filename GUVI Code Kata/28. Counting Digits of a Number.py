# Problem Statement: Count the number of digits of a given number N.Size of the integer ranges from 1<N<100000000
# Sample Input: 548
# Sample Output: 3

n = int(input())
n = str(n)
count = 0
for _ in n:
    count += 1
print(count)