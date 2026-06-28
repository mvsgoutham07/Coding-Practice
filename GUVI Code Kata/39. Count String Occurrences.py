# Problem Statement: Given a sentence and string S, find how many times S occurs in the given sentence.If S is not found in the sentence print -1
# Input Description:
# Input Size : |sentence| <= 1000000(complexity O(n)).
# Output Description: The output is the number of times S occurs in the given sentence, or -1 if S is not found.
# Sample Input:
# I enjoy doing codekata
# codekata
# Sample Output:
# 1

h = input()
s = input()
if s in h:
    print(h.count(s))
else:
    print(-1)