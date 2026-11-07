/* Given a number ‘n’, find the sum of its digits. 
Sample Input: 456 
Sample Output: 15 */

#include <stdio.h>

// Iterative Approach
int main()
{
    int n, sum = 0, last_digit;
    printf("Enter a number : ");
    scanf("%d", &n);
    while (n > 0)
    {
        last_digit = n % 10;
        sum += last_digit;
        n /= 10;
    }
    printf("Sum of digits : %d", sum);
    return 0;
}
