/*
 * https://app.codesignal.com/arcade/intro/level-5/XC9Q2DhRRKQrfLhb5
*/

int avoidObstacles(int[] inputArray) {
	int count = 0;
    boolean karar = true;
    while(karar) {
        count++;
        karar = false;
        for(int number : inputArray) {
            if(number % count == 0)
            {
                karar = true;
                break;
            }
        }
    }
    
    return count;
}
