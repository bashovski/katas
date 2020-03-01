/**
    Kata link: https://www.codewars.com/kata/exes-and-ohs/train/java
 */

public class XO {
  
  public static boolean getXO (String str) {
    
    int numOfX = 0, numOfO = 0;
    for(int i = 0, len = str.length(); i < len; i++) {
      if(str.charAt(i) == 'x' || str.charAt(i) == 'X') numOfX++;
      else if(str.charAt(i) == 'o' || str.charAt(i) == 'O') numOfO++;
    }
    if(numOfX == numOfO) return true;
    return false;
  }
}