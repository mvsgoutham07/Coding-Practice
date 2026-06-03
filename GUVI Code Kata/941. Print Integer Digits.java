/* Problem Statement: Write a code to get an integer N and print the digits of the integer.
Input Description: A single line contains an integer N.
Output Description: Print the digits of the integer in a single line separated by space.
Explanation: The digits are splitted and displayed.
Sample Input:
348
Sample Output:
3 4 8 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        n = Math.abs(n);
        String s = String.valueOf(n);
        for (int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i<s.length()-1) {
                System.out.print(" ");
            }
        }
    }
}