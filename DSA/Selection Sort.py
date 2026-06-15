# Selection Sort
def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        _min = i
        for j in range(i+1, n):
            if arr[j]<arr[_min]:
                _min = j
        arr[i], arr[_min] = arr[_min], arr[i]
    return arr
arr = list(map(int, input().split()))
print(selection_sort(arr))