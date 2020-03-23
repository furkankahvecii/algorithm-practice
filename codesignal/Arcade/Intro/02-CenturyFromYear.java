/*
 * https://app.codesignal.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN
*/

int centuryFromYear(int year) {
    return year % 100 == 0 ? year/100 : (year/100)+1;
}
