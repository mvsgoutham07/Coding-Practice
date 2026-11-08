/* Print all the stepping numbers that occur within a user-defined range. */

#include <stdio.h>
#include <stdlib.h>
int is_stepping(int num)
{
    int prev, curr;
    prev = num % 10;
    num /= 10;
    while (num > 0)
    {
        curr = num % 10;
        if (abs(curr - prev) != 1)
        {
            return 0;
        }
        prev = curr;
        num = num / 10;
    }
    return 1;
}
int main()
{
    int start, end;
    printf("Enter the lower and upper limits : ");
    scanf("%d %d", &start, &end);
    printf("Stepping Numbers between %d and %d : ", start, end);
    for (int i = start; i <= end; i++)
    {
        if(is_stepping(i))
        {
            printf("%d ", i);
        }
    }
    return 0;
}