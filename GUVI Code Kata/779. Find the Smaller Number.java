/* Problem Statement: You are provided with two numbers. Find and print the smaller number.
Input Description: You are provided with two numbers as input.
Output Description: Print the small number out of the two numbers.
Sample Input:
23 1
Sample Output:
1
Explanation: 1 < 23 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        double smaller = Math.min(a, b);
        if (smaller == (int) smaller) {
            System.out.println((int) smaller);
        } else {
            System.out.println(smaller);
        }
    }
}