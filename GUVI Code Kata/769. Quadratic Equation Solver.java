/* Problem Statement: You are given the coefficients of a quadratic equation in order A, B & C. Where A is the coefficient of X², B is the coefficient of X and C is the constant term in the most simplified form. Example: For X² + 5X + 6 = 0, you are given the input as: 1 5 6. Write a program to find all of the roots of the quadratic.
Note: The output should be up to 2nd decimal place (round off if needed) and in case of a recurring decimal use braces i.e. for eg: 0.33333..... => 0.33.
Note: Use Shri Dharacharya's Method to solve i.e. X = {-b + √(b² - 4ac) } / 2a & {-b-√(b² -4ac)} / 2a
Input Description: Three numbers corresponding to the coefficients of x(squared), x and constant are given as an input in that particular order
Output Description: Print the two values of X after rounding off to 2 decimal places if required.
Explanation: X = {-b + √(b² - 4ac) } / 2a & {-b-√(b² -4ac)} / 2a
a = 1, b = 5, c = 6.
Sample Input:
1 5 6
Sample Output:
-2.00
-3.00 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double discriminant = (b * b) - (4.0 * a * c);
        if (discriminant >= 0) {
            double sqrtD = Math.sqrt(discriminant);
            double root1 = (-b + sqrtD) / (2.0 * a);
            double root2 = (-b - sqrtD) / (2.0 * a);
            if (root1 >= root2) {
                System.out.printf("%.2f%n", root1);
                System.out.printf("%.2f%n", root2);
            } else {
                System.out.printf("%.2f%n", root2);
                System.out.printf("%.2f%n", root1);
            }
        } else {
            System.out.println("0.00");
            System.out.println("0.00");
        }
        sc.close();
    }
}   