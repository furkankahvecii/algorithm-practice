/*
 * https://app.codesignal.com/arcade/intro/level-6/mCkmbxdMsMTjBc3Bm
*/

int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
    return Arrays.stream(inputArray).map(i -> i == elemToReplace ? substitutionElem  :i).toArray();
}
