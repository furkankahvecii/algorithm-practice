// https://www.codewars.com/kata/554e4a2f232cdd87d9000038/

function DNA_strand($dna) {
  return strtr($dna, "ATCG", "TAGC");
}
