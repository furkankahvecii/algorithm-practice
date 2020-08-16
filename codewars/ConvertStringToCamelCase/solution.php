// https://www.codewars.com/kata/517abf86da9663f1d2000003

function toCamelCase($str){
    $keywords = preg_split("/[-_]/", $str);
    $result = "";
    for($i = 0 ; $i<count($keywords) ; $i++)
    {
        $result .= ($i == 0 ? $keywords[$i] : ucfirst($keywords[$i]));
    }
    
    return $result;
}
