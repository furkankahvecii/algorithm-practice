/*
 * https://app.codesignal.com/arcade/intro/level-10/TXFLopNcCNbJLQivP
*/

String findEmailDomain(String address) {
    String addressSplit[] = address.split("@");
    return addressSplit[addressSplit.length-1];
}
