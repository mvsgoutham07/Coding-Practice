/* Given a number ‘n’, find the sum of its digits. 
Sample Input: 456 
Sample Output: 15 */

#include <stdio.h>

// String-based Approach
int main()
{
    char num[1000];
    int sum = 0;
    printf("Enter a number : ");
    scanf("%s", num);
    for (int i = 0; num[i] != '\0'; i++)
    {
        sum += num[i] - '0';
    }
    printf("Sum of digits : %d", sum);
    return 0;
}
