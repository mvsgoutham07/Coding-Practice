# Problem Statement: Given 2 numbers N,M. Find their difference and check whether it is even or odd.
# Sample Input: 5 5
# Sample Output: even

n, m = map(int, input().split())
s = abs(n-m)
if s%2==0:
    print("even")
else:
    print("odd")