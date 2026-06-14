arr = list(map(int, input("Enter array elements : ").split()))
target = int(input("Enter target element : "))
arr.sort()
print("Sorted Array :", arr)

# Iterative Binary Search
def iterative_binary_search(arr, target):
    low = 0
    high = len(arr)-1
    while low<=high:
        mid = (low + high)//2
        if arr[mid]==target:
            return mid 
        elif target>arr[mid]:
            low = mid + 1
        else:
            high = mid - 1
    return -1
result1 = iterative_binary_search(arr, target)
if result1 != -1:
    print("Target element found at index (ITERATIVE) :", result1)
else:
    print("Target element not found")


# Recursive Binary Search
def recursive_binary_search(arr, low, high, target):
    if low>high:
        return -1
    mid = (low+high)//2
    if arr[mid]==target:
        return mid
    elif target>arr[mid]:
        return recursive_binary_search(arr, mid+1, high, target)
    else:
        return recursive_binary_search(arr, low, mid-1, target)
result2 = recursive_binary_search(arr, 0, len(arr)-1, target)
if result2 != -1:
    print ("Target element found at index (RECURSIVE) :", result2)
else:
    print("Target element not found.")