/*
I. Add a new status – SingleParent – where the tax is computed as a SINGLE but with a further
reduction of $5000 per child.
* 
II. Add a new tax condition – if the income is greater than $249,999 for SINGLE, then add a tax of
25% on income amount above $150,000; if the income is greater than $349,999 for MARRIED,
then add a tax of 35% on income amount above $200,000.
* 
III. Unknown status – if the status doesn’t belong to SINGLE or MARRIED or SINGLE_PARENT, then
compute a 33% tax on the income
*/
/**
* Assignment1/Q10, COMP268
* Class:TaxReturn.java
* Purpose: to modify the given program using the given specifications 
* @author: Lei Feng
* Student ID: 3294132
* Date: July 19, 2016
* Version 1.0
* based on :David J. Eck, Hobart and William Smith Colleges(Version 6.0, June 2011),
* Introduction to Programming Using Java
*/
import java.util.Scanner;

public class TaxReturn {

    /**
    Constructs a TaxReturn object for a given income and
    marital status, and computes the tax.
    @param anIncome the taxpayer income
    @param aStatus either SINGLE or MARRIED
    */
    public TaxReturn(double anIncome, int aStatus, int children) {
        
	income = anIncome;
	status = aStatus;
	this.children = children;
        
	}

    public double getTax() {
        
	double tax = 0;
        
        //Add a new status – SingleParent – where the tax is computed as a SINGLE 
        //but with a further reduction of $5000 per child.       
	if (status == SINGLE || status == SINGLE_PARENT) {
            if (income <= SINGLE_BRACKET1)
		tax = RATE1 * income;
            
            else if (income <= SINGLE_BRACKET2)
                    tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (income - SINGLE_BRACKET1);
                
            else {
                    tax = RATE1 * SINGLE_BRACKET1 + RATE2 * (SINGLE_BRACKET2 - SINGLE_BRACKET1) + RATE3 * (income - SINGLE_BRACKET2);
        //Add a new tax condition – if the income is greater than $249,999 for SINGLE, then add a tax of
        //25% on income amount above $150,000            
                if (income > SINGLE_BRACKET3) {
                    tax += (income - SINGLE_BRACKET4) * RATE4;
			}
                     }
                    tax -= CHILDREN_REDUCTION * children;
		} 
            else if (status == MARRIED) {
                    
                if (income <= MARRIED_BRACKET1)
			tax = RATE1 * income;
                    else if (income <= MARRIED_BRACKET2)
                            tax = RATE1 * MARRIED_BRACKET1 + RATE2 * (income - MARRIED_BRACKET1);
                    else {                    
                        tax = RATE1 * MARRIED_BRACKET1 + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1) + RATE3 * (income - MARRIED_BRACKET2);
      
        // if the income is greater than $349,999 for MARRIED,
        //then add a tax of 35% on income amount above $200,000.          
                if (income > MARRIED_BRACKET3) {
                            tax += (income - MARRIED_BRACKET4) * RATE5;
			}
                             }
		}
            
        //if the status doesn’t belong to SINGLE or MARRIED or SINGLE_PARENT, then
        //compute a 33% tax on the income
            else {
			tax = income * TaxReturn.RATE6;
		}
		return tax;
	}

	public static final int SINGLE = 1;
	public static final int MARRIED = 2;
        //declare single parent and unknon people
	public static final int SINGLE_PARENT = 3;
	public static final int UNKNOWN = 4;    
        
	private static final double RATE1 = 0.15;
	private static final double RATE2 = 0.28;
	private static final double RATE3 = 0.31;  
        
        //declare rate 4 5 6
	private static final double RATE4 = 0.25;
	private static final double RATE5 = 0.35;
	private static final double RATE6 = 0.33;  
        
	private static final double SINGLE_BRACKET1 = 21450;
	private static final double SINGLE_BRACKET2 = 51900;
        
        //declare income for both single and married bracket
	private static final double SINGLE_BRACKET3 = 249999;
	private static final double SINGLE_BRACKET4 = 150000;
	private static final double MARRIED_BRACKET1 = 35800;
	private static final double MARRIED_BRACKET2 = 86500;        
	private static final double MARRIED_BRACKET3 = 349999;
	private static final double MARRIED_BRACKET4 = 200000;  
        
        //declare a further reduction of $5000 per child
	private static final double CHILDREN_REDUCTION = 5000;
	private double income;
	private int status;
	private int children;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your income: ");
		double income = in.nextDouble();
		System.out.print("Enter S (single) or M (married) or SP (Single Parent): ");
		String input = in.next();
		int status = 0;
                //declare children
		int children = 0;
                
		if (input.equalsIgnoreCase("S"))
			status = TaxReturn.SINGLE;
		else if (input.equalsIgnoreCase("M"))
			status = TaxReturn.MARRIED;
                //add a new status that is for single parent
		else if (input.equalsIgnoreCase("SP")) {
			status = TaxReturn.SINGLE_PARENT;
			System.out.print("Please enter # of children: ");
			children = in.nextInt();
		} 
                //add a new status that is for unknown
                else {
			status = TaxReturn.UNKNOWN;
		}
		TaxReturn aTaxReturn = new TaxReturn(income, status, children);
		System.out.println("The tax is " + aTaxReturn.getTax());
	}
}
