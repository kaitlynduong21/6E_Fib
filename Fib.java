/**
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1

  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /**
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
      if (n == 0) {           //decision between base cases and recursive cases
        return 0;             //solution to base case 0
      } else {
        if (n == 1) {         //decision between base cases and recursive cases
          return 1;           //solution to base case 1
        } else {
          return fib_recurrence(n - 1) + fib_recurrence(n - 2); //recusive abstraction
        }
      }
    }
     /* These are class / instance methods because...
        class methods because it does not matter what object is calling the method
    */


    /**
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
      if (n == 0) {
        return 0;
      }
      int fib = 1;
      int lastFib = 0;
      while (n >= 2) {
        int temporary = fib;
        fib+=lastFib;
        lastFib = temporary;
        n--;
      }
        return fib; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be ... n

       As the proxy for the time required, count... the number of time it goes through the while loop

       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because the number of times we go though the while loop is increases by the same factor.
     */


    /**
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
      double phi = (1 + Math.sqrt(5)) / 2 ;
      double psi = (1 - Math.sqrt(5)) / 2 ;
      double fib = (Math.pow(phi,n) - Math.pow(psi,n)) / Math.sqrt(5);
      return fib; // invalid Fibonacci number
    }
    /* Time complexity:
       Consider the size of the problem to be ... n

       As the proxy for the time required, count... the number of calls to the power operation

       Then cost of the the recurrence algorithm
       grows constant
       as the size of the problem increases,
       because the number of calls to Math.pow is not affected by the size of the problem.
     */
}
