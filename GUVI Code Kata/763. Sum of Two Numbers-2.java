/* Problem Statement: You are given Two Numbers, A and B. If C = A + B. Find C.
Note: Round off the output to a single decimal place.
Input Description: You are provided with two numbers A and B.
Output Description: Find the sum of the two numbers (A + B)
Explanation: 1+1 = 2
Sample Input:
1
1
Sample Output:
2 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int c = a+b;
        System.out.println(c);
    }
}