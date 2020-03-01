/**
 * https://www.codewars.com/kata/5541f58a944b85ce6d00006a
 */
public class ProdFib { // must be public for codewars	
	
    public static long[] productFib(long prod) {

        long first = getFibonacciNumberByIndex(0),
            second = getFibonacciNumberByIndex(1),
            i = 1;
            
        while(first * second < prod) {
            first = getFibonacciNumberByIndex(i);
            second = getFibonacciNumberByIndex(i+1);
            i++;
        }
        if(first * second == prod)
            return new long[] {first, second, 1};
            
        second = getFibonacciNumberByIndex(i);
        return new long[]{first, second, 0};
    }
    
    private static long getFibonacciNumberByIndex(long index) {
      long first = 1, 
           fib = 0, 
           temp;
      while(index >= 0) {
          temp = first;
          first += fib;
          fib = temp;
          index--;
      }
      return fib;
    }
}