/* Problem Statement: Write a program to get a string as input and reverse the string without using temporary variable.
Input Description: A single line containing a string.
Output Description: Print the reversed string.
Explanation: The string is reversed.
Sample Input:
GUVI
Sample Output:
IVUG */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(new StringBuilder(s).reverse());
    }
}