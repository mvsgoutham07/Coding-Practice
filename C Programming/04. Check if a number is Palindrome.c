#include <stdio.h>
int reverse_digits(int num)
{
    int rev = 0, last_digit;
    while (num > 0)
    {
        last_digit = num % 10;
        rev = rev * 10 + last_digit;
        num /= 10;
    }
    return rev;
}
int main()
{
    int n;
    printf("Enter a number : ");
    scanf("%d", &n);
    if (n == reverse_digits(n))
    {
        printf("PALINDROME");
    } 
    else 
    {
        printf("Not Palindrome");
    }
    return 0;
}
