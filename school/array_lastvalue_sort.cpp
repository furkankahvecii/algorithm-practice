#include <stdio.h> 
#include <stdlib.h> 

void binarySearch(int array[], int n, int value)
{
	int low = 0,high = n;

	while (low < high) {
		int mid = (low + high)/ 2;
		if (array[mid] < value) low = mid + 1;
		else high = mid;
	}
	for(int k=n-2; k>=low; k--){
        array[k+1]=array[k];            
    }
    
	array[low] = value;
}

void printList(int arr[], int n) 
{  
	int i=0;
	for(i = 0;i<n;i++){
		printf("%d ",arr[i]);
	}
	printf("\n\n");
} 

int main() 
{ 
	int array[] = {13,56,87,93,105,120,900,860};
	int size = sizeof(array) / sizeof(array[0]);
	printList(array,size);
	binarySearch(array,size,array[size-1]);	
	printList(array,size);
	return 0; 
} 

