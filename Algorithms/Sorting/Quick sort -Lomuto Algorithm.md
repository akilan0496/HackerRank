# Quick Sort - Lomuto Algorithm

```
partition(arr[], lo, hi) 
    pivot = arr[hi]
    i = lo     // place for swapping
    for j := lo to hi – 1 do
        if arr[j] <= pivot then
            swap arr[i] with arr[j]
            i = i + 1
    swap arr[i] with arr[hi]
    return i
```

```
//code

	static void quickSort(int[] a, int low, int high) {
       if(low  < high) {
           int pi = partition(a, low, high);           
            printArray(a);
           quickSort(a, low, pi-1);
           quickSort(a, pi+1, high);   
       }    
    }
    
    static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int iterator = low;
        
        for(int i=low;i<high;i++) {
            if(a[i] < pivot) {
                int tmp = a[i];
                a[i] = a[iterator];
                a[iterator] = tmp;
                iterator++;
            }
        }
        int tmp = a[high];
        a[high] = a[iterator];
        a[iterator] = tmp;
        
        return iterator;
    }
```