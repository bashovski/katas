/**
 * Kata link: https://www.codewars.com/kata/testing-1-2-3/java
 */

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List <String> codeLines = new ArrayList<String>();
        for(int i = 0; i < lines.size(); i++) {
            codeLines.add(((i+1)+": "+ lines.get(i)));
        }
        return codeLines;
    }
} 