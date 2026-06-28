# Problem Statement: Given 2 numbers N and K followed by N elements, print the number of repetition of K otherwise print '-1' if the element not found.
# Sample Input:
# 6 2
# 1 2 3 5 7 8
# Sample Output: 1

n, k = map(int, input().split())
h = list(map(int, input().split()))
count = 0
if k not in h:
    print(-1)
else:
    for i in h:
        if i==k:
            count += 1 
    print(count)