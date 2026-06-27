# Concentric Square Number Pattern

n = int(input("Enter a number : "))
size = 2 * n - 1
for i in range(size):
    for j in range(size):
        val = max(abs(i - n + 1), abs(j - n + 1)) + 1
        print(val, end=" ")
    print()