/* Problem Statement: You will be provided with a number. Print the number of days in the month corresponding to that number.
Note: In case the input is February, print 28 days.
Note: If the Input is not in valid range print "Error".
Input Description: The input is in the form of a number.
Output Description: Find the days in the month corresponding to the input number.
Print Error if the input is not in a valid range.
Explanation: 8 corresponds to august month.
There are 31 days in the month of August.
Sample Input:
8
Sample Output:
31 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();
        int days;
        if (m==2) {
            days = 28;
            System.out.println(days);
        } else if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
            days = 31;
            System.out.println(days);
        } else if (m==4 || m==6 || m==9 || m==11) {
            days = 30;
            System.out.println(days);
        } else {
            System.out.println("Error");
        }
    }
}