/* Problem Statement: Write a code to get an integer N and print the even values from 1 till N in a separate line.
Input Description: A single line contains an integer N.
Output Description: Print the even values from 1 to N in a separate line.
Explanation: The even values from 1 upto N is printed.
Sample Input:
6
Sample Output:
2
4
6 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i=1; i<=n; i++) {
            if (i%2==0) {
            System.out.println(i);
        }
        }
    }
}