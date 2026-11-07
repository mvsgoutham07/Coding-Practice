/* Given a number ‘n’, find the sum of its digits. 
Sample Input: 456 
Sample Output: 15 */

#include <stdio.h>

// Recursive Approach
int sum_of_digits(int num)
{
    if (num == 0)
    {
        return 0;
    }
    return (num % 10) + sum_of_digits(num / 10);
}
int main()
{
    int n, result;
    printf("Enter a number : ");
    scanf("%d", &n);
    result = sum_of_digits(n);
    printf("Sum of digits : %d", result);
    return 0;
}
