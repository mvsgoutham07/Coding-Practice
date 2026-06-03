/* Problem Statement: Write a code to get an integer N and print the values from N to 1.
Input Description: A single line contains an integer N.
Output Description: Print the values from N to 1 in a separate line.
Explanation: The values from N upto 1 is printed.
Sample Input:
10
Sample Output:
10
9
8
7
6
5
4
3
2
1 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i=n; i>0; i--) {
            System.out.println(i);
        }
    }
}