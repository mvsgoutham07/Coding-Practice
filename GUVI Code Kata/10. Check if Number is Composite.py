# Problem Statement: Given a number N, print 'yes' if it is composite else print 'no'.
# Sample Input: 123
# Sample Output: yes

n = int(input())
if n <= 1:
    print("no")
else:
    for i in range(2, n):
        if n % i == 0:
            print("yes") 
            break
    else:
        print("no")  