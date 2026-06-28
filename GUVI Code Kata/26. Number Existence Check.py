# Problem Statement: Given 2 numbers N and K followed by elements of N .Print 'yes' if K exists else print 'no'.
# Input Description: The input consists of two integers, N and K, followed by N integers.
# Output Description: The output is 'yes' if K is found among the N integers, otherwise 'no'.
# Sample Input:
# 4 2
# 1 2 3 3
# Sample Output: yes

n, k = map(int, input().split())
h = list(map(int, input().split()))
if k not in h:
    print("no")
else:
    print("yes")