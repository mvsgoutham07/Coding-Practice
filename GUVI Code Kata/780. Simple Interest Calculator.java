/* Problem Statement: You are given with Principle amount($), Interest Rate(%) and Time (years) in that order. Find Simple Interest.
Note: Print the output up to two decimal places (Round-off if necessary).
Note: S.I. = PTR/100
Input Description: Three values are given to you as the input. these values correspond to Principle amount, Interest Rate and Time in that particular order.
Output Description: Find the Simple interest and print it up to two decimal places. Round off if required.
Explanation: P = 1000 $
T = 2 Years
R = 5 %
S.I. = 1000*2*5/100 = 100.00
Sample Input:
1000 2 5
Sample Output:
100.00 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double si = (p*t*r)/100;
        System.out.printf("%.2f%n", si);
    }
}