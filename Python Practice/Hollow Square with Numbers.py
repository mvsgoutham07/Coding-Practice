# Hollow Square with Numbers

n = int(input("Enter a number : "))
for i in range(1, n + 1):
    row = ""
    for j in range(1, n + 1):
        if i == 1 or i == n or j == 1 or j == n:
            row += str(j) + " "
        else:
            row += "  "
    print(row)