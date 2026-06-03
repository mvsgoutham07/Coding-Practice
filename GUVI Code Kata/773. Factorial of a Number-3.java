/* Problem Statement: You are provided with a number, "N". Find its factorial.
Input Description: A positive integer is provided as an input.
Output Description: Print the factorial of the integer.
Explanation: 2! = 2*1 = 2
Sample Input:
2
Sample Output:
2 */

import java.util.*;
public class Main {
    public static long factorial(int n){
        if (n==0||n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = factorial(n);
        System.out.println(result);
    }
}