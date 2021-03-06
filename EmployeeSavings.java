
/**
*@author Lei Feng
*/
import java.util.Arrays;

public class EmployeeSavings extends AddressBook {
        //declaration
	private double accountValue;
	private double[] monthlyInterests;
	private double[] monthlySavings;
        //annual interst rate is 0.05
	public static final double ANNUAL_INTEREST_RATE = 0.05;
        //the monthly interest rate is 0.05/12 = 0.00417
	double mRate = 0.00417;
	int m = 3;
        /**
         * main method
         * to print the output
         * @param args 
         */
    public static void main(String[] args) {
		EmployeeSavings[] empSavings = new EmployeeSavings[] {
				new EmployeeSavings("Elena", "Brandon", new double[12]),
				new EmployeeSavings("Thomas", "Molson", new double[12]),
				new EmployeeSavings("Hamilton", "Winn", new double[12]),
				new EmployeeSavings("Suzie", "Sarandin", new double[12]),
				new EmployeeSavings("Philip", "Winne", new double[12]),
				new EmployeeSavings("Alex", "Trebok", new double[12]),
				new EmployeeSavings("Emma", "Pivoto", new double[12]),
				new EmployeeSavings("John", "Lenthen", new double[12]),
				new EmployeeSavings("James", "Lean", new double[12]),
				new EmployeeSavings("Jane", "Ostin", new double[12]),
				new EmployeeSavings("Emily", "Car", new double[12]),
				new EmployeeSavings("Daniel", "Hamshire", new double[12]),
				new EmployeeSavings("Neda", "Bazdar", new double[12]),
				new EmployeeSavings("Aaron", "Smith", new double[12]),
				new EmployeeSavings("Kate", "Hen", new double[12]) };
		for (EmployeeSavings emp : empSavings) {
			emp.generateMonthlySavings();
		}
		System.out.println(EmployeeSavings.getReport(empSavings));
	}
        /**
         * 
         * @return accountValue
         */
        public double getAccountValue() {
		return accountValue;
	}
        /**
         * 
         * @return monthlyInterests
         */
        public double[] calculateInterests() {
            
		accountValue = 0;
		for (int i = 0; i < monthlyInterests.length; i++) {
			accountValue += monthlySavings[i];
			monthlyInterests[i] = round(accountValue * mRate, m);
			accountValue += monthlyInterests[i];
		}
		accountValue = round(accountValue, m);
		return monthlyInterests;
	}
        /**
         * 
         * @return monthlyInterests
         */
        public double[] generateMonthlySavings() {
            
		for (int i = 0; i < monthlySavings.length; i++) {
                    monthlySavings[i] = round(Math.random() * 700 + 100, m);
		}
		return monthlySavings;
	}
        /**
         * 
         * @return monthlyInterests
         */
        public double[] getMonthlyInterests() {
		return monthlyInterests;
	}
        /**
         * 
         * @return monthlySavings
         */
        public double[] getMonthlySavings() {
		return monthlySavings;
	}
        /**
         * 
         * @param fn firstName
         * @param ln lastName
         */
	public EmployeeSavings(String fn, String ln) {
		super(fn, "", ln);
	}
        /**
         * 
         * @param fn firstName
         * @param ln lastName
         * @param savings savings
         */
	public EmployeeSavings(String fn, String ln, double[] savings) {
		super(fn, "", ln);
                
		this.monthlySavings = savings;
		this.monthlyInterests = new double[savings.length];
	}
        /**
         * get the report with first name,last name,monthly savings,
         * monthly interests,and account value in array
         * @param arr
         * @return report
         */
	public static String getReport(EmployeeSavings[] arr) {
            
		String report = "";
		for (EmployeeSavings emp : arr) {
                    emp.calculateInterests();
                    report += emp.getFirstName() + " " + emp.getLastName()+ ": \nsaved: "
                            + Arrays.toString(emp.getMonthlySavings())
                            + "\nInerests: "
                            + Arrays.toString(emp.getMonthlyInterests())
                            + "\nFinal account value:" + emp.getAccountValue() + "\n\n";
		}
		return report;
	}
/**
 * 
 * @param value value * factor
 * @param places how many places
 * @return tmp / factor
 */
	public static double round(double value, int tms) {
            //using Math.pow(10,places ) to compute 
		double a = (double) Math.pow(10, tms);
		value = value * a;
		double b = Math.round(value);
		return (double) b / a;
	}

	

}
