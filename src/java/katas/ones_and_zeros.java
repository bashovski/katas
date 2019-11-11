/**
 * Kata link: https://www.codewars.com/kata/ones-and-zeros/java
 */
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0, size = binary.size()-1;
        for(int i = 0; i < binary.size(); i++) {
            result += binary.get(size-i) * Math.pow(2, i );
        }
        return result;
    }
}