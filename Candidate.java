/*
Google Inc. is looking to recruit three of the Boston runners. The criteria for selection are as follows:
I.  Average final marks in bachelor’s degree (store up to 2 decimal places). The fifteen candidates
have the following grades: 82.30%, 85.10%, 77.77%, 69.93%, 93.03%, 88.61%, 55.99%, 87.49%,
88.00%, 91.20%, 66.79%, 76.65%, 55.89%, 90.01%, and 87.9%.
II.  Ability to communicate as one of the three values – “excellent”, “average”, and “poor”. The
fifteen candidates have the following ability to communicate, respectively: poor, poor, average,
average, average, poor, excellent, excellent, excellent, average, excellent, average, excellent,
excellent, poor.
III.  Innovation as one of the two values – “brilliant” and “average” (store as a Boolean; brilliant =
true and average = false). The fifteen candidates have the following innovative abilities:
brilliant, average, average, average, brilliant, brilliant, average, brilliant, average, brilliant,
average, brilliant, brilliant, average, average.
IV.  Ability to regulate one’s own skill as a probability value between 0 and 1.0 – 1.0 implies
excellent regulatory capabilities and 0.0 implies no skills to regulate (store as a double). The
fifteen candidates have the following regulatory abilities: 0.5, 1.0, 0.8, 0.0, 1.0, 0.7, 0.8, 0,9, 0.5,
0.6, 0.3, 0.2, 0.5, 0.3, 0.8.
Store these values for the fifteen candidates in an extended AddressBook class. In general, Google
will not consider a candidate with average marks of less than 85%. Google will consider a candidate
with average marks of less than 85% only if the candidate at least has 0.5 regulatory abilities and at
least ‘average’ ability to communicate. Google will only consider a candidate with poor
communication ability if the candidate has a ‘brilliant’ innovation capability. Write a program that
will help Google to programmatically determine eligibility of the fifteen candidates for these
positions, and print the output on the console.
 */

/**
* Assignment1/Q8, COMP268
* Class:Candidate.java
* Purpose: help google Inc to recruit three of the Boston runners by their
* Average final marks in bachelor’s degree,
* Ability to communicate as one of the three values – “excellent”, “average”, and “poor”,
* Innovation as one of the two values – “brilliant” and “average”,
* Ability to regulate one’s own skill as a probability value between 0 and 1.0 .
* @author: Lei Feng
* Student ID: 3294132
* Date: July 19, 2016
* Version 1.0
* based on :David J. Eck, Hobart and William Smith Colleges(Version 6.0, June 2011),
* Introduction to Programming Using Java
*/
import java.util.ArrayList;

public class Candidate extends AddressBook {
        //declaration
	private boolean innovation;
	private double grade;
	private double regulation;
	private String communication;
        /**
         * main method
         * store all the candidate date of their names,
         * grades,communications,innovations.and regulations
         * the to get the elligible candidates to print
         * @param args 
         */
        public static void main(String[] args) {
            Candidate[] cands = new Candidate[] {
				new Candidate("Elena", "Brandon", 82.30, "poor", true, 0.5),
				new Candidate("Thomas", "Molson", 85.10, "poor", false, 1.0),
				new Candidate("Hamilton", "Winn", 77.77, "average", false, 0.8),
				new Candidate("Suzie", "Sarandin", 69.93, "average", false, 0.0),
				new Candidate("Philip", "Winne",  93.03, "average", true, 1.0),
				new Candidate("Alex", "Trebok",  88.61, "poor", true, 0.7),
				new Candidate("Emma", "Pivoto", 55.99, "excellent", false, 0.8 ),
				new Candidate("John", "Lenthen", 87.49, "excellent", true, 0.9),
				new Candidate("James", "Lean", 88.00, "excellent", false, 0.5),
				new Candidate("Jane", "Ostin", 91.20, "average", true, 0.6),
				new Candidate("Emily", "Car", 66.79, "excellent", false, 0.3),
				new Candidate("Daniel", "Hamshire", 76.65, "average", true, 0.2),
				new Candidate("Neda", "Bazdar", 55.89, "excellent", true, 0.5),
				new Candidate("Aaron", "Smith", 90.01, "excellent", false, 0.3),
				new Candidate("Kate", "Hen", 87.9, "poor", false, 0.8) };
                
            ArrayList<Candidate> ec = Candidate.getEligibleCandidates(cands);
            System.out.printf(ec.toString());
	}
    /**
     * 
     * @return innovation
     */            
    public boolean isInnovation() {
            return innovation;
	}
    /**
     * 
     * @param fn first name
     * @param ln last name
     * @param grade grade
     * @param comm communication
     * @param innov innovation
     * @param reg regulation
     */
    public Candidate(String fn, String ln,double grade, String comm,  boolean innov, double reg) {
            super(fn,"",ln);
            this.innovation = innov;
            this.grade = grade;
            this.regulation = reg;
            this.communication = comm;
	}
   /**
    * 
    * @return grade
    */ 
    public double getGrade() {
            return grade;
	}
    /**
     * 
     * @return regulation
     */
    public double getRegulation() {
            return regulation;
	}
    /**
     * 
     * @param cands
     * @return elligible candidates
     */
    public static ArrayList<Candidate> getEligibleCandidates(Candidate[] cands) {
        //create a new array list for candidates
	ArrayList<Candidate> ec = new ArrayList<Candidate>();
		for (Candidate can : cands) {
                    //to get all the candidates whose grade equal or greater than 85 or at least has 0.5%
                    //or regulatory abilities and at least ‘average’ ability to communicate.
                    if ((can.getGrade() >= 85) || (can.getRegulation() >= 0.5 || ((!can.getCommunication().equals("poor"))
                            &&can.isInnovation()))) {
		ec.add(can);
		}
	}
            return ec;
	}
    /**
     * 
     * @return communication
     */
    public String getCommunication() {
            return communication;
	}
    /**
     * 
     * @param communication 
     */    
    public void setCommunication(String communication) {
            this.communication = communication;
	}
    /**
     * 
     * @param grade 
     */    
    public void setGrade(double grade) {
            this.grade = grade;
	}
    /**
     * 
     * @param innovation 
     */    
    public void setInnovation(boolean innovation) {
            this.innovation = innovation;
	}
    /**
     * 
     * @param regulation 
     */    
    public void setRegulation(double regulation) {
            this.regulation = regulation;
	}
	public String toString() {
        
        //return formately print    
	return String.format("\n%s %s: %.2f, %s, %b, %.1f \n", getFirstName(),
		getLastName(), getGrade(), getCommunication(),isInnovation(), getRegulation()
	);
	}

}