/* Problem Statement: Write a code to get 2 integers A and N. Print the integer A, N times in separate line.
Input Description: First line contains an integer A.
Second line contains an Integer N.
Output Description: Print the integer A, N times in a separate line.
Explanation: The integer A(2) is printed N(3) times.
Sample Input:
2 3
Sample Output:
2
2
2 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        for (int i=0; i<n; i++) {
            System.out.println(a);
        }
    }
}