/**
 * Kata link: https://www.codewars.com/kata/double-cola/train/java
 */
public class Line {
   public static String WhoIsNext(String[] names, int n) {
   
        String rval = "";
        int len = names.length - 1;
        if(n - 1 <= len) {
            rval = names[n-1];
        }else {
            while(n-1 > len) {
                n = (n - len) / 2;
            }
            rval = names[n-1];
        }
        return rval;
    }
}