// https://www.codewars.com/kata/56747fd5cb988479af000028/

function getMiddle($text) {
    return strlen($text) % 2 == 0 ? substr($text,strlen($text)/2-1,2) : substr($text,strlen($text)/2, 1); 
}
