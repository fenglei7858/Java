
/**
*@author Lei Feng
*/
import java.util.ArrayList;
import java.util.Scanner;

public class HailstoneSequence {

    public static void main(String[] args) {
        //create a new scanner;
	Scanner input = new Scanner(System.in);
        //display messages      
	System.out.println("Enter a positive integer for Hailstone Sequence:");
	ArrayList<Integer> hss = HailstoneSequence.getHailStoneSequence(input.nextInt());
	System.out.printf("showing the Hailstone sequence below:\n" +"%s\nIt took %d steps to reach 1\n", hss.toString(), hss.size()-1);
	}
    
	public static ArrayList<Integer> getHailStoneSequence(int n){
            //create a arrayList with integer
            ArrayList<Integer> hss = new ArrayList<>();
            //add in the array 
            hss.add(new Integer(n));
            //while loop
             while (n>1){
            //Pick some positive integer and call it n. If n is even,
            //divide it by two. If n is odd, multiply it by three and add one
		 if (n%2 == 0){
                     n /= 2;
		 } else {
			 n = n*3 +1;
			 }
		 hss.add(new Integer(n));
		 }
             //return hss
		 return hss;
	}
	
	

}
