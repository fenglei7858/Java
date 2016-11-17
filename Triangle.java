
/**
*@author Lei Feng
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

