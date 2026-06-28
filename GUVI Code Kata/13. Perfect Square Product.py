# Problem Statement:Given 2 numbers N,M. Print 'yes' if their product is a perfect square else print 'no'.
# Sample Input: 5 5
# Sample Output: yes

import math
a, b = map(int, input().split())
c = a*b
d = math.isqrt(c)
if d*d==c:
    print("yes")
else:
    print("no")