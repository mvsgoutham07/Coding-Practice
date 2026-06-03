/* Problem Statement: You are given with a number A i.e. the temperature in Celcius. Write a program to convert this into Fahrenheit.
Note: In case of decimal values, round-off to two decimal places.
Input Description: A number is provided in Celcius as the input of the program.
Output Description: The output shall be the temperature converted into Fahrenheit corresponding to the input value print up to two decimal places and round off if required.
Explanation: (X°C × 9/5) + 32 = 32°F here X is the input
Sample Input:
12
Sample Output:
53.60 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.printf("%.2f%n", fahrenheit);
        sc.close();
    }
}   