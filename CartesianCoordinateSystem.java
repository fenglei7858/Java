
/**
*@author Lei Feng
*/
import java.util.Scanner;

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
