/* Problem Statement: You are given A = Length of a rectangle & B = breadth of a rectangle. Find its area “C”. (A and B are natural numbers)
Input Description: The inputs are two natural numbers representing the length and the breadth of a rectangle.
Output Description: Find the area of the rectangle formed by the provided input. Round off the answer to the first decimal place if required.
Explanation: Area = LB = AB = 2*3 = 6
Sample Input:
2
3
Sample Output:
6 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int area = l*b;
        System.out.println(area);
    }
}