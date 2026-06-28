/* Problem Statement: Given base(B) and height(H) of a triangle find its area.
Input Description: The input consists of the base (B) and height (H) of a triangle. The input size N is up to 1000000.
Sample Input: 2 4
Sample Output: 4 */

#include <stdio.h>
float area(int b, int h) {
    float result = 0.5*b*h;
    return result;
}
int main() {
    int b, h;
    scanf("%d %d", &b, &h);
    float f = area(b, h);
    if (f == (int)f) {
        printf("%d", (int)f);
    } else {
        printf("%.1f", f);
    }
    return 0;
}