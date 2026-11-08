/* Plus One (LeetCode – 66) 
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits. 

Test Case 1: 
Input: digits = [1,2,3] 
Output: [1,2,4] 
Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4]. 

Test Case 2: 
Input: digits = [4,3,2,1] 
Output: [4,3,2,2] 
Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the result should be [4,3,2,2]. 

Test Case 3: 
Input: digits = [9] 
Output: [1,0] 
Explanation: The array represents the integer 9. Incrementing by one gives 9 + 1 = 10. Thus, the result should be [1,0]. */

#include <stdio.h>
int main()
{
    int size, i;
    printf("Enter the size of the array : ");
    scanf("%d", &size);
    int arr[size];
    printf("Enter array elements : ");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (i = size-1; i >= 0; i--)
    {
        if (arr[i] < 9)
        {
            arr[i] += 1;
            break;
        }
        arr[i] = 0;
    }
    if (i < 0)
    {
        printf("1 ");
    }
    for (i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}