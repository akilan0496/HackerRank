# Insertion Sorting

Step 1 - If it is the first element, it is already sorted. return 1;

Step 2 - Pick next element

Step 3 - Compare with all elements in the sorted sub-list

Step 4 - Shift all the elements in the sorted sub-list that is greater than the 
         value to be sorted

Step 5 - Insert the value

Step 6 - Repeat until list is sorted

```
// Code

for(int j=1;j<ar.length;j++) {
            
	int key = ar[j];
	int keyComparePos = j -1;
    		
	for(int i=keyComparePos;i>=0 && key < ar[i];i--){
		ar[i+1] = ar[i];
		ar[i] = key;
	}
	printArray(ar);
}
```
