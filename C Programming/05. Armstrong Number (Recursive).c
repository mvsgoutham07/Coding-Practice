/* Given a number ‘n’, find if it is an Armstrong Number or not. */
#include <stdio.h>
#include <math.h>
// Recursive Approach
int digits_count(int num)
{
    if (num == 0)
        return 0;
    return 1 + digits_count(num/10);
}
int armstrong(int num, int digits)
{
    if (num == 0)
        return 0;
    return pow(num % 10, digits) + armstrong(num / 10, digits);
}
int main()
{
    int n;
    printf("Enter a number : ");
    scanf("%d", &n);
    int digits = digits_count(n);
    if (armstrong(n, digits) == n)
    {
        printf("ARMSTRONG NUMBER");
    }
    else 
    {
        printf("Not Armstrong Number");
    }
    return 0;
}