/* Given a number ‘n’, find if it is an Armstrong Number or not. */
#include <stdio.h>
#include <math.h>
// Iterative Approach
int main()
{
    int n, temp, check, digits = 0, sum = 0, last_digit;
    printf("Enter a number : ");
    scanf("%d", &n);
    temp = check = n;
    while (temp > 0)
    {
        digits++;
        temp /= 10;
    }
    while (check > 0)
    {
        last_digit = check % 10;
        sum += pow(last_digit, digits);
        check /= 10;
    }
    if (sum == n)
    {
        printf("ARMSTRONG NUMBER");
    }
    else 
    {
        printf("Not Armstrong Number");
    }
    return 0;
}