/*
 * https://app.codesignal.com/arcade/intro/level-7/8PxjMSncp9ApA4DAb
*/

int depositProfit(int deposit, int rate, int threshold) {
   	return (int) Math.ceil(Math.log((threshold + 0.0) / deposit) / Math.log((100 + rate) / 100.0));
}
