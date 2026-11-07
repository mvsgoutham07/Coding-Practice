/* Given a number ‘n’, reverse its digits. */

#include <stdio.h>
// Iterative Approach
int main()
{
    int n, rev = 0, last_digit;
    printf("Enter a number : ");
    scanf("%d", &n);
    while (n != 0)
    {
        last_digit = n % 10;
        rev = rev * 10 + last_digit;
        n /= 10;
    }
    printf("Reversed : %d", rev);
    return 0;
}
