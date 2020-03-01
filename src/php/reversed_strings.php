/**
    Kata link: https://www.codewars.com/kata/5168bb5dfe9a00b126000018
 */
function solution($str) {
  $result = '';
  for($i = 0, $len = strlen($str); $i <= $len; $i++) {
    $result = $result . $str[$len - $i];
  }
  return $result;
}