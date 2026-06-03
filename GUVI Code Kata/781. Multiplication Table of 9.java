/* Problem Statement: Using the method of looping, write a program to print the table of 9 till N in the format as follows:
(N is input by the user)

9 18 27...

Note: Print NULL if 0 is input.
Input Description: A positive integer is provided as an input.
Output Description: Print the table of nine with single space between the elements till the number that is input.
Sample Input:
3
Sample Output:
9 18 27
Explanation: 9*1 = 9
9*2 = 18
9*3 = 27 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        if (n==0) {
            System.out.println("NULL");
        } else {
            for (int i=1; i<=n; i++) {
            System.out.print(9*i);
            if (i<n) {
                System.out.print(" ");
            }
        }
        
        }
    }
}