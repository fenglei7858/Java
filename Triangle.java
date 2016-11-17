/*
“The Pythagorean Theorem relates the lengths of the three sides of any right triangle. The legs of a
right triangle (the two sides of the triangle that meet at the right angle) are customarily labelled as
having lengths “a” and “b”, and the hypotenuse (the long side of the triangle, opposite the right
angle) is labelled as having length “c”. The lengths are related by the following equation: a ^2 + b^2
= c ^2.” – refer to http://www.purplemath.com/modules/pythagthm.htm for details.
This equation allows you to find the length of a side of a right triangle when they’ve given you the
lengths for the other two sides, and, going in the other direction, allows you to determine if a
triangle is a right triangle when they’ve given you the lengths for all three sides.
This equation can alternatively be written as c = sqrt of (a^2+b^2). You can find the square root of a
number by calling the standard function Math.sqrt. For example, the statement double y =
Math.sqrt(x) sets y to the square root of x.
I. Given the right triangles described below, write a program to compute the lengths of the
remaining sides using a program.
a. a = 48 and c = 80
b. a = 84 and c = 91
II. Determine if the following triangles are right-angled triangles:
a. a = 45, b = 55, and c = 75
b. a = 28, b = 45, and c = 5
*/
/**
* Assignment1/Q6, COMP268
* Class:Triangle.java
* Purpose: to modify the given program using the given specifications 
* @author: Lei Feng
* Student ID: 3294132
* Date: July 19, 2016
* Version 1.0
* based on :David J. Eck, Hobart and William Smith Colleges(Version 6.0, June 2011),
* Introduction to Programming Using Java
*/
public class Triangle {   
    //declaration
     private boolean rightTriangle;
     private double a,b,c;
     
     /**
      * create Trangle t1,t2,t3,t4 with given inputs
      * display meassges
      * @param args 
      */
     public static void main(String[] args) {
        //create Triangle t1,t2 with given inputs;
	Triangle t1 = new Triangle(48, 80);
	Triangle t2 = new Triangle(84, 91);
        
        //display messages using get classes, set output format to keep zero place of decimal;
	System.out.printf("a = %.0f, b = %.0f, c = %.0f \n", 
                t1.getA(),t1.getB(), t1.getC());
	System.out.printf("a = %.0f, b = %.0f, c = %.0f \n", 
                t2.getA(),t2.getB(), t2.getC());
        
        //create Triangle t3,t4 with given inputs;
	Triangle t3 = new Triangle(45, 55, 75);
	Triangle t4 = new Triangle(28, 45, 53);
        
        //display messages using get classes, set output format to keep zero place of decimal;
	System.out.printf("a = %.0f, b = %.0f, c = %.0f, is RightTriangle: %b\n",
                t3.getA(), t3.getB(), t3.getC(), t3.isRightTriangle());
	System.out.printf("a = %.0f, b = %.0f, c = %.0f, is RightTriangle: %b\n",
		t4.getA(), t4.getB(), t4.getC(), t4.isRightTriangle());

	}
     /**
      * 
      * @return a*a + b*b = c*c;
      */
     public boolean isRightTriangle(){
         //according to right angle triangle means c*c equals a*a+b*b ; 
         return a * a + b * b == c * c;
     }
     /**
      * 
      * @return a
      */
     public double getA(){
         return a;
     }
     /**
      * 
      * @return b
      */
     public double getB(){
         return b;
     }
     /**
      * 
      * @return c
      */
     public double getC(){
         return c;
     }
     /**
      * 
      * @param a
      * @param c 
      */
     public Triangle(double a, double c) {
		this.a = a;
		this.b = 0; 
                this.c = c;
	}
     /**
      * 
      * @param a
      * @param b
      * @param c 
      */
     public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		rightTriangle = this.isRightTriangle();
	}
}

