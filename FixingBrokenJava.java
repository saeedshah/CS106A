/* 
 * File: FixingBrokenJava.java
 * Name: Saeed
 * Section Leader:
 * 
 * This program does not work as intended.  It contains both compile-time errors (errors that prevent the compiler from even
 * running the program) and run-time errors (errors where the  program does not function as intended).  Your job is to fix
 * this program so that it works correctly.  Note that it is *not* sufficient to simply fix the compiler errors; you will need to
 * update the logic as well.  *  This program attempts to read a positive integer from the user, then check whether that integer is prime (whether its only
 * divisors are 1 and itself).  If so, it prints a message saying that the number is prime; otherwise it says that the number is composite.
 */

import acm.program.*;
public class FixingBrokenJava extends ConsoleProgram {
        private static final int SENTINEL = 0;
     // Reads a number from the user and reports if it's prime or not.
        
    public void run() {
          /* Get the value from the user. */
          int value = readPositiveInt();
            while (value!=SENTINEL){
                        if (isPrime(value)) {
                                println(value + " is prime.");
                        } else {
                                println(value + " is composite.");
                        }
                        value = readPositiveInt();
                }
                
                println("User exited");         
        }
        
        /**
         * Given a positive integer, returns whether that integer is
         * prime.
         * 
         * @param value The value to test.
         * @return Whether or not it is prime.
         */
        private boolean isPrime(int value) {
                /* Try all possible divisors of the number.  If any of them
                 * cleanly divide the number, we return that the number is
                 * composite.
                 */
                
                /* 
                 *  Divisor could not be 0 and should
                 *  not try divisor 1 (all numbers are divisible by one) 
                 */
                for (int divisor = 2; divisor < value; divisor++) {
                        if (value % divisor == 0) {
                                return false;
                        }
                }
                
                return true;
        }
        
        /**
         * Reads a positive integer from the user and returns it.
         *          * @return A positive integer entered by the user.
         */
        private int readPositiveInt() {
                /* Get an initial value. */
                int value = readInt("Enter a positive integer: ");
                
                /* If the value was nonpositive, reprompt the user. */
                while (value <= 0 && value!=SENTINEL ) {
                        println("Please enter a positive integer.");
                        value = readInt("Enter a positive integer: ");
                }
                
                return value;
        }
}
