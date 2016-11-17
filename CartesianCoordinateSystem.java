
import java.util.Scanner;

/*
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2).
 * Calculate anddisplay the distance between the two points using the formula below. Round the answer up to 2
 * decimal points. You can use Math.pow(a,0.5) to compute the square root of an expression.
 * Math.pow() returns a double.
 */

/**
* Assignment1/Q3, COMP268
* Class:CartesianCoordinateSystem.java
* Purpose: using math.pow() code to create a mathod to 
*  calculate and display the distance between the two points(x1,x2),(y1,y2)
* @author: Lei Feng
* Student ID: 3294132
* Date: July 19, 2016
* Version 1.0
* based on :David J. Eck, Hobart and William Smith Colleges(Version 6.0, June 2011),
* Introduction to Programming Using Java
*/
public class CartesianCoordinateSystem {

	/**
	 * test calculateDistance
         * @param args
	 */
	public static void main(String[] args) {
            //create 4 scanners
            Scanner inputX1 = new Scanner(System.in);
            Scanner inputX2 = new Scanner(System.in);
            Scanner inputY1 = new Scanner(System.in);
            Scanner inputY2 = new Scanner(System.in);
            
            // to get x1, x2, y1, y2 inputs
            System.out.printf("Please enter two points (x1,x2)\n");
            double x1 = inputX1.nextDouble();
            double x2 = inputX1.nextDouble();
            System.out.printf("Please enter two points (y1,y2)\n");
            double y1 = inputX1.nextDouble();
            double y2= inputX1.nextDouble();
        //print outputs    
        System.out.printf("The distance is:  "+ CartesianCoordinateSystem.calculateDistance(x1, x2, y1, y2));
	}
	/**
         * 
         * @param x1
         * @param x2
         * @param y1
         * @param y2
         * @return 
         */
	public static double calculateDistance(double x1, double x2, double y1, double y2){
            //using the given formula
		return Math.pow(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2), 0.5);
	}

}
