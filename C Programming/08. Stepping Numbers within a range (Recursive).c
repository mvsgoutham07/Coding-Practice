/* Print all the stepping numbers that occur within a user-defined range. */

#include <stdio.h>
#include <stdlib.h>
int is_stepping(int num, int prev)
{
    if (num == 0)
    {
        return 1;
    }
    int curr = num % 10;
    if (prev == -1)
    {
        return is_stepping(num / 10, curr);
    }
    if (abs(curr - prev) != 1)
    {
        return 0;
    }
    return is_stepping(num / 10, curr);
}
int main()
{
    int start, end;
    printf("Enter the lower and upper limits : ");
    scanf("%d %d", &start, &end);
    printf("Stepping Numbers between %d and %d : ", start, end);
    for (int i = start; i <= end; i++)
    {
        if(is_stepping(i, -1))
        {
            printf("%d ", i);
        }
    }
    return 0;
}