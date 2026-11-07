/* Given a number ‘n’, find the count of its digits. */

#include <stdio.h>
// Recursive Approach
int count_digits(int num);
int main()
{
    int n, result;
    printf("Enter a number : ");
    scanf("%d", &n);
    result = count_digits(n);
    printf("No. of digits : %d", result);
    return 0;
}
int count_digits(int num)
{
    if (num == 0)
    {
        return 0;
    }
    return 1 + count_digits(num / 10);
}