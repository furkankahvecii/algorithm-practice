// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/

function accum($s) {
    $result = array();
    $index = 0;
    foreach (str_split($s) as $char) {
        array_push($result,strtoupper($char) . str_repeat(strtolower($char),$index++));
    }
    
    return join('-', $result);
}
