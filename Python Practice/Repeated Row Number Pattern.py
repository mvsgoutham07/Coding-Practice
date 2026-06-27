# Repeated Row Number Pattern

n = int(input("Enter a number : "))
for i in range(1, n + 1):
    for _ in range(i):
        print(i, end=" ")
    print()