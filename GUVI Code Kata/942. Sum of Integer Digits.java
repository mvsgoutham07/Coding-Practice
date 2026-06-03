/* Problem Statement: Write a code get an integer number as input and print the sum of the digits.
Input Description: A single line containing an integer.
Output Description: Print the sum of the digits of the integer.
Explanation: 1+2+4=7
Sample Input:
124
Sample Output:
7 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        n = Math.abs(n);
        String h = String.valueOf(n);
        int sum = 0;
        for(int i=0; i<h.length(); i++) {
            char ch = h.charAt(i);
            int digit = Character.getNumericValue(ch);
            sum += digit;
        }
        System.out.println(sum);
    }
}