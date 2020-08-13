// https://www.codewars.com/kata/546f922b54af40e1e90001da/solutions

function alphabet_position(string $s): string {
    $array = [];
    $s = strtolower($s);
    foreach(str_split($s) as $c){
      if(ctype_alpha($c))
        $array[] = (ord($c)-96);
    }
    return join(" ",$array);
}
