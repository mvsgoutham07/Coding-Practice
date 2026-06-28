/* Problem Statement: Given 3 numbers A,B,C find the sum of Arithmetic Series with a=A, d=B and n=C
Sample Input: 1 1 2
Sample Output: 3 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            long a = sc.nextLong();
            long d = sc.nextLong();
            long n = sc.nextLong();
            long sum = (n*(2*a + (n-1)*d))/2;
            System.out.println(sum);
        }
        sc.close();
    }
}