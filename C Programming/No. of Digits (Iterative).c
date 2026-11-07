/* Given a number ‘n’, find the count of its digits. */

#include <stdio.h>
// Iterative Approach
int main()
{
    int n, digits = 0;
    printf("Enter a number : ");
    scanf("%d", &n);
    while (n > 0)
    {
        digits++;
        n /= 10;
    }
    printf("No. of digits : %d", digits);
    return 0;
}