/* Kochouseph Chittilappilly went to Dhruvz Planet, a gaming space, with his friends and played a game called “Guess the Word”. 
Rules of the game are – Computer displays some strings on the screen and the player should pick one string/word. If this word matches with the random word that the computer picks, then the player is declared as Winner. 
Kochouseph Chittilappilly’s friends played the game and no one won the game. This is Kochouseph Chittilappilly’s turn to play, and he decided to must win the game. 
What he observed from his friends’ game is that the computer is picking up the string whose length is odd and also that should be maximum. 
Due to system failure, computers sometimes cannot generate odd-length words. In such cases, you will lose the game anyways, and it displays “better luck next time”. 
He needs your help. Check the below cases for a better understanding. 

Sample Input-1: 
5 
Hello 
Good 
morning 
Welcome 
you 
Sample Output 1: morning 
Explanation: First word that is picked by the computer is morning. 
Hello → 5 
Good → 4 
Morning → 7 
Welcome → 7 
You → 3 

Sample Input 2: 
3 
Go 
to 
hell 
Sample Output 2: Better luck next time 
Explanation: Here is no word with odd length, so computer confuses and gives better luck next time. */

#include <stdio.h>
#include <string.h>
int main()
{
    int n, len, max = 0;
    char str[100], result[100] = "";
    printf("Enter the number of strings : ");
    scanf("%d", &n);
    printf("Enter the strings : \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%s", str);
        len = strlen(str);
        if (len % 2 != 0 && len > max)
        {
            max = len;
            strcpy(result, str);
        }
    }
    if (max == 0)
    {
        printf("Btter luck next time !");
    }
    else
    {
        printf("Result : %s", result);
    }
    return 0;
}