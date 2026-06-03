/* Problem Statement: Write a code to get an integer N and print the sum of values from 1 to N.
Input Description: A single line contains an integer N.
Output Description: Print the sum of values from 1 to N.
Explanation: The sum of values from 1-10 is 55.
Sample Input:
10
Sample Output:
55 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}