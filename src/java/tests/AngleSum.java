/**
    Kata link: https://www.codewars.com/kata/sum-of-angles/train/java
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals(AngleSum.sumOfAngles(3),180);
        assertEquals(AngleSum.sumOfAngles(4),360);
    }
}