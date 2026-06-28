# Problem Statement: Given a number N followed by N elements, find the second smallest element.If it cannot be found then print -1
# Input Description:
# Input Size : N <= 100000 
# Sample Input:
# 5
# 1 2 3 4 5
# Sample Output:
# 2

n = int(input())
arr = list(map(int, input().split()))
_arr = list(set(arr))
_arr.sort()
if len(_arr)<2:
    print(-1)
else:
    print(_arr[1])