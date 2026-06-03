/* Problem Statement: Write a code to get 2 integers as input and find the HCF of the 2 integer without using recursion or Euclidean algorithm.
Input Description: A single line containing 2 integers separated by space.
Output Description: Print the HCF of the integers.
Explanation: The HCF of 2 and 3 is 1 as they are prime numbers.
Sample Input:
2 3
Sample Output:
1 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        int min = Math.min(a, b);
        int hcf = 1;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i; 
            }
        }
        System.out.println(hcf);
        sc.close();
    }
}   