/**
 * Kata link: https://www.codewars.com/kata/youre-a-square/train/java
 */
public class Square {    
    public static boolean isSquare(int n) {        
        if(Math.sqrt(n)%1 == 0) return true; else return false; 
    }
} 