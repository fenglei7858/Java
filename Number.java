/*
 * Write a program that iterates through numbers from 0 to 113 using a loop. Print the numbers, one
number per line. As you print each number, say x, also print the following when appropriate,
separated by commas:
I. If the number is odd, print “x is odd”
II. If the number is divisible by 5, print “hi five”
III. If the total of a number (x) and its subsequent number (x+1) is a value divisible by 7, print “wow”
IV. If the number is prime, print “prime”.
 */

/**
* Assignment1/Q9, COMP268
* Class:Number.java
* Purpose: Write a program that can recognize 4 conditions and print what it is.
* @author: Lei Feng
* Student ID: 3294132
* Date: July 19, 2016
* Version 1.0
* based on :David J. Eck, Hobart and William Smith Colleges(Version 6.0, June 2011),
* Introduction to Programming Using Java
*/
import java.util.ArrayList;

public class Number {
    /**
     * print output from 0 - 103
     * @param args 
     */
    public static void main(String[] args) {
        
	System.out.println(Number.iterate(103).toString());
        
	}
     /**
      * different condition prints different output
      * @param n
      * @return array1
      */
    public static ArrayList<String> iterate(int n) {
        
	ArrayList<String> array1 = new ArrayList<String>();
        
	String str;
	for (int i = 0; i <= n; i++) {
            
            str = String.format("\n%d", i);
            if (Number.isOdd(i))
		str += ", is odd ";
            
            if (Number.isDivisibleBy5(i))
		str += ", hi five ";
            
            if (Number.isDivisibleBy7(2 * i + 1))
		str += ", wow ";
            
            if (Number.isPrime(i))
		str += ", prime ";
	array1.add(str);
		}
            return array1;
	}
    /**
     * 
     * @param n
     * @return the number divisible by 5
     */
    public static boolean isDivisibleBy5(int n) {
	return n % 5 == 0;
	}
    /**
     * 
     * @param n
     * @return the number divisible by 7
     */
    public static boolean isDivisibleBy7(int n) {
	return n % 7 == 0;
	}
    /**
     * 
     * @param n
     * @return the number is odd
     */
    public static boolean isOdd(int n) {
	return n % 2 != 0;
	}
    /**
     * 
     * @param n
     * @return is prime
     */
    public static boolean isPrime(int n) {
        
	if (n < 2)
        return false;
        
        for (int i = 2; i < Math.sqrt(n) + 1 && i < n; i++) {
            if (n % i == 0)
               return false;}    
	return true;       
	}
}
