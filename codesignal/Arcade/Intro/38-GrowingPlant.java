/*
 * https://app.codesignal.com/arcade/intro/level-9/xHvruDnQCx7mYom3T
*/

int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
	if(upSpeed>=desiredHeight)
		return 1;
	int grow = 0,count=1;
	while(true) {
		grow+=(upSpeed);
		if(grow<desiredHeight) {
			grow -= downSpeed;
		}
		else
			break;
		count++;
	}
	return count;
}

