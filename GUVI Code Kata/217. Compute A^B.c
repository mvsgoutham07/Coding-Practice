/* Problem Statement: Given numbers A,B find A^B.
Input Description:
Input Size : 1 <= A <= 5 <= B <= 50
Sample Input: 3 4
Sample Output: 81 */

#include <stdio.h>
int power(int a, int b) {
    int res=1;
    for (int i=0; i<b; i++) {
        res *= a;
    }
    return res;
}
int main() {
    int a, b, result;
    scanf("%d %d", &a, &b);
    result = power(a, b);
    printf("%d", result);
    return 0;
}