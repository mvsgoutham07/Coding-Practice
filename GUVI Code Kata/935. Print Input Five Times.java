/* Problem Statement: Write a code to get the input and print it 5 times.
Input Description: A single line contains an integer N.
Output Description: Output contains 5 lines with each line having the value N.
Explanation: The value N has been written 5 times.
Sample Input:
4
Sample Output:
4
4
4
4
4 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i=0; i<5; i++) {
            System.out.println(n);
        }
    }
}