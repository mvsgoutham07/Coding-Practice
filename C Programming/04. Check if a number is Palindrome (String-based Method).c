/* Given a number ‘n’, find out whether it is a Palindrome or not. */
#include <stdio.h>
#include <string.h>
int main()
{
    char n[1000];
    printf("Enter a number : ");
    scanf("%s", n);
    int len = strlen(n);
    for (int i = 0; i < len/2; i++)
    {
        if (n[i] != n[len-1-i])
        {
            printf("Not Palindrome");
        }
        else 
        {
            printf("PALINDROME");
        }
    }
    return 0;
}