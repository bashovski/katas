/**
    Kata link: https://www.codewars.com/kata/5748838ce2fab90b86001b1a
 */
class AreaOfASquareTest extends TestCase {
  public function testFixed() {
    $this->assertEquals(0, square_area(0));
    $this->assertEquals(1.62, square_area(2));
    $this->assertEquals(80, square_area(14.05));
  }
}