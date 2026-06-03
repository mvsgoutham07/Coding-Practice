/* Problem Statement: You are given three numbers A, B & C. Print the largest amongst these three numbers.
Input Description: Three numbers are provided to you.
Output Description: Find and print the largest among the three
Sample Input:
1
2
3
Sample Output:
3
Explanation: 3 > 2 && 1 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        double largest = Math.max(a, Math.max(b, c));
        if (largest == (int) largest) {
            System.out.println((int) largest);
        } else {
            System.out.println(largest);
        }
    }
}   