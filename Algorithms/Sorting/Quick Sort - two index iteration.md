# Quick Sort - two index iteration

Step 1 - Choose the highest index value has pivot

Step 2 - Take two variables to point left and right of the list excluding pivot

Step 3 - left points to the low index

Step 4 - right points to the high

Step 5 - while value at left is less than pivot move right

Step 6 - while value at right is greater than pivot move left

Step 7 - if both step 5 and step 6 does not match swap left and right

Step 8 - if left = right, the point where they met is new pivot

```
// Code

static void partition(int[] ar, int left, int right) {
	int n = ar.length;
	int pivot = ar[left + (right - left) / 2];
    int i = left;
    int j = right;
    while (i <= j) {
    	while (ar[i] < pivot) {
        	i++;
        }
        while (ar[j] > pivot) {
        	j--;
        }
        if (i <= j) {
        	int temp = ar[i];
        	ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
    }
    if(left < j)
    	partition(ar,left,j);
    if(i < right)
    	partition(ar,i,right);
    printArray(ar);
}
```
