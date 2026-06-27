# Number Diamond Pattern

n = int(input("Enter a number : "))
for i in range(1, n + 1):
    print(" " * (n - i), end="")
    for x in range(1, i + 1):
        print(x, end=" ")
    print()
for i in range(n - 1, 0, -1):
    print(" " * (n - i), end="")
    for x in range(1, i + 1):
        print(x, end=" ")
    print()