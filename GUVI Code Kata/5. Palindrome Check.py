# Problem Statement : Given a string S, print 'yes' if it is a palindrome or 'no' if it is not a palindrome.
# Sample Input : lappal
# Sample Output : yes

s = input()
if s==s[::-1]:
    print("yes")
else:
    print("no")