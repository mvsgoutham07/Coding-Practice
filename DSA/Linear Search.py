arr = list(map(int, input().split()))
target = int(input())

# Linear Search
def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i]==target:
            return i
        # if target in arr:
            # return arr.index(target)
    return -1
print("Target element found at index (LINEAR SEARCH) : ", linear_search(arr, target))

# Find All Occurrences
def find_all(arr, target):
    result = []
    for i in range(len(arr)):
        if arr[i]==target:
            result.append(i)
    return result
print("Target element found at indices : ", *find_all(arr, target))

# Count Occurrences
def count_occurrences(arr, target):
    count = 0
    for num in arr:
        if num==target:
            count += 1
    return count
print("No. of times target element occurred in the array : ", count_occurrences(arr, target))