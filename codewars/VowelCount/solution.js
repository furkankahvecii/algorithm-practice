// https://www.codewars.com/kata/54ff3102c1bad923760001f3

function getCount(str) {
  return [...str].filter( c => c =='a' || c=='e' || c =='i' || c== 'o' || c == 'u').length;
}
