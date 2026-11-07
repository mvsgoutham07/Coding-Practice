/* Given a number ‘n’, reverse its digits. */

#include <stdio.h>
// Recursive Approach
int reverse_digits(int num, int rev)
{
    if (num == 0)
    {
        return rev;
    }
    int last_digit = num % 10;
    return reverse_digits(num / 10, rev * 10 + last_digit);
}
int main()
{
    int n, result;
    printf("Enter a number : ");
    scanf("%d", &n);
    result = reverse_digits(n, 0);
    printf("Reversed : %d", result);
    return 0;
}
