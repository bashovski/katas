/**
    Kata link: https://www.codewars.com/kata/5168bb5dfe9a00b126000018
 */

class ReversedStringsTest extends TestCase {
  public function testExamples() {
    $this->assertEquals("dlrow", solution("world"));
    $this->assertEquals("olleh", solution("hello"));
    $this->assertEquals("", solution(""));
    $this->assertEquals('h', solution("h"));
  }
}