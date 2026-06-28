/* Problem Statement: Given a number N, print the sum of squares of all its digits.
Input Description: The input consists of a number N, where 1 <= N <= 100000.
Output Description: The output is the sum of squares of all digits of N.
Sample Input: 12
Sample Output: 5 */

#include <stdio.h>
int sumOfSquares(int n) {
    int sum = 0, remainder;
    while (n > 0) {
        remainder = n % 10;
        sum += remainder * remainder;
        n /= 10;
    }
    return sum;
}
int main() {
    int N;
    scanf("%d", &N);
    int result = sumOfSquares(N);
    printf("%d", result);
    return 0;
}   