/**
    Kata link: https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/solutions/java
 */

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Anur", "Basic"}, Solution.stringToArray("Anur Basic"));
    }
}