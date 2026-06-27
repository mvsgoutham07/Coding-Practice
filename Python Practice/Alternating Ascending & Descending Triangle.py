# Alternating Ascending & Descending Triangle

n = int(input("Enter a number : "))
for i in range(1, n + 1):
    if i % 2 == 0:
        for x in range(i, 0, -1):
            print(x, end=" ")
    else:
        for x in range(1, i + 1):
            print(x, end=" ")
    print()