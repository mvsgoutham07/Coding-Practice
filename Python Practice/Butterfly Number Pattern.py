# Butterfly Number Pattern

n = int(input("Enter a number : "))
for i in range(1, n + 1):
    left = "".join(str(x) for x in range(1, i + 1))
    middle = " " * (2 * (n - i))
    right = "".join(str(x) for x in range(i, 0, -1))
    print(left + middle + right)