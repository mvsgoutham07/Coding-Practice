# Problem Statement:
# Given 2 numbers N and M add both the numbers and check whether the sum is odd or even.

# Input Description:
# The input consists of two integers, N and M.

# Output Description:
# The output is 'odd' if the sum of N and M is odd, and 'even' if the sum is even.

# Sample Input:
# 9 2

# Sample Output:
# odd

n, m = map(int, input().split())
sum = n+m
if sum%2==0:
    print("even")
else:
    print("odd")