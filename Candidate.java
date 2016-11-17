/**
*@author Lei Feng
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
