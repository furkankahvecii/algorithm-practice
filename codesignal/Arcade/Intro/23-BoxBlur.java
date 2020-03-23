/*
 * https://app.codesignal.com/arcade/intro/level-5/5xPitc3yT3dqS7XkP
*/

int[][] boxBlur(int[][] image) {
    int [][] result = new int[image.length-2][image[0].length-2];
		
    for(int i=0;i<=image.length-3;i++) {
        for(int j=0;j<=image[i].length-3;j++) {
            int a = calculate(image,i,j);
            result[i][j] = a;
        }
    }
		
    return result;
}

int calculate(int[][] image,int i, int j) {
    int sum = 0;
    for(int q=i;q<i+3;q++) {
        for(int w=j;w<j+3;w++) {
            sum += image[q][w];
        }
    }
    return sum/9;
}
