/**
    Kata link: https://www.codewars.com/kata/find-the-missing-letter/java
 */

public class Kata {
  public static char findMissingLetter(char[] array) {

      String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
      for(int i = 0, j = letters.indexOf(array[0]), len = array.length; i < len; i++) {
          if(array[i] != letters.charAt(i+j))
              return (char) ((int) array[i]-1);
          continue;
      }
      return 'z';
  }
}