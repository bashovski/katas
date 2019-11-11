/**
 * Kata link: https://www.codewars.com/kata/sum-of-odd-numbers/train/java
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class RowSumOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}