/* Problem Statement: You are provided with the radius of a circle "A". Find the length of its circumference.
Note: In case the output is coming in decimal, roundoff to 2nd decimal place.
Note: In case the input is a negative number, print "Error".
Input Description: The Radius of a circle is provided as the input of the program.
Output Description: Calculate and print the Circumference of the circle corresponding to the input radius up to two decimal places.
Explanation: Circumference of a Circle = 2*(22/7)*r where 22/7 represents 'pie' and r represents the radius of the circle.
Sample Input:
2
Sample Output:
12.57 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();
        if (r<0) {
            System.out.println("Error");
        } else {
            double c = 2*(Math.PI)*r;
            System.out.printf("%.2f%n", c);
        }
    }
}