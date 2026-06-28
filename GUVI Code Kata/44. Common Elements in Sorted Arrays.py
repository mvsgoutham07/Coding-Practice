# Problem Statement: Given a number N and 2 arrays A and B of sorted order of size N, print the common elements.If it is not found print -1.
# Input Description:
# Input Size : 1 <= N <= 100000
# Sample Input:
# 5
# 1 1 1 1 1
# 1 2 3 4 5
# Sample Output: 1

n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

common = sorted(list(set(a) & set(b)))

if common:
    print(*common)
else:
    print(-1)   