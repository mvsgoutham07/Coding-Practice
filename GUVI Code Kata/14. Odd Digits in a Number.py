# Problem Statement: Given a number N, print the odd digits in the number(space seperated) or print -1 if there is no odd digit in the given number.
# Input Description: The input consists of a single integer N, where N <= 100000.
# Output Description: The output should be the odd digits of N, space-separated, or -1 if no odd digits are present.
# Sample Input: 2143
# Sample Output: 1 3

n = int(input())
n = abs(n)
n = str(n)

odd_digits = []

for i in n:
    i = int(i)
    if (i % 2 != 0):
        odd_digits.append(i)

if not odd_digits:
    print("-1")
else:
    print(*odd_digits)   