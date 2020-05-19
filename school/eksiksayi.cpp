#include <stdio.h>
#include <stdlib.h>
 
int missingNumber(int nums[],int length)
{
	int miss = length, i = 0;

    for (i = 1; i < length; i++) {
        miss = miss ^ i ^ nums[i];
    }
   
    return miss;
}

int main()
{
    int array[] = {0,1,2,3,4,5,6,7};
    int missNumber = missingNumber(array,sizeof(array)/sizeof(int));
    printf("Dizideki eksik sayi = %d",missNumber);
    return 0;
}


 
