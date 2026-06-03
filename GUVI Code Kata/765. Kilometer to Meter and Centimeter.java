/* Problem Statement: You are given a number A in Kilometers. Convert this into B: Meters and C: Centi-Metres.
Input Description: A number "A" representing some distance in kilometer is provided to you as the input.
Output Description: Convert and print this value in meters and centimeters.
Explanation: 1 KM = 1000 M
1M = 100 CM
1KM = 1000*100 CM = 100000 CM
Sample Input:
2
Sample Output:
2000
200000 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        sc.close();
        int m = km*1000;
        int cm = m*100;
        System.out.println(m);
        System.out.println(cm);
    }
}