/*
 * https://app.codesignal.com/arcade/intro/level-4/xvkRbxYkdHdHNCKjg
*/

int arrayChange(int[] inputArray) {
    int count = 0;
    for(int i = 0 ; i<inputArray.length-1;i++) {
        if(inputArray[i]>inputArray[i+1]) {
            int add = (inputArray[i]-inputArray[i+1])+1;
            inputArray[i+1]+=add;
            count += add;
        }
        if(inputArray[i] == inputArray[i+1]) {
            count++;
            inputArray[i+1]++;
        }
    }	
            
    return count;
}
