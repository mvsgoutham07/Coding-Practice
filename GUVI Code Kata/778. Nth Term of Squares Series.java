/* Problem Statement: You are provided with a number "N", Find the Nth term of the series: 1, 4, 9, 16, 25, 36, 49, 64, 81, .......
Note: Print "Error" if N = negative value and 0 if N = 0.
Input Description: An integer N is provided to you as the input.
Output Description: Find the Nth term in the provided series.
Explanation: The Nth term in the series = N*N
18*18 = 324
Sample Input:
18
Sample Output:
324 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n==0) {
            System.out.println(0);
        } else if (n<0) {
            System.out.println("Error");
        } else {
            System.out.println((long) n*n);
        }
    }
}