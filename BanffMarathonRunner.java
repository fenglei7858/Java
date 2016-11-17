/* A group of AU friends decide to run the Banff, Alberta, Marathon. Their names, times (marathon
 * completion time in minutes), and number of years participated are given below:
    1  Elena Brandon  341 1
    2  Thomas Molson  273 2
    3  Hamilton Winn  278 5
    4  Suzie Sarandin  329 7
    5  Philip Winne  445 9
    6  Alex Trebok  275 3
    7  Emma Pivoto  275 4
    8  John Lenthen  243 1
    9  James Lean  334 1
    10 Jane Ostin  412 1
    11 Emily Car  393 4
    12 Daniel Hamshire 299 4
    13 Neda Bazdar  343 3
    14 Aaron Smith  317 6
    15 Kate Hen  265 8
 * Computer Science 268: Introduction to Programming (Java) Page 4 of 11
 * Extend the AddressBook class from Problem 1 to store the additional data. Now, write a method
 * to find the fastest runner. Print the name, address, and his/her time (in minutes) on three separate
 * lines.
 * Find the second fastest runner. Print the name, address, his/her time (in minutes), and the
 * difference in time with the fastest runner.
 * Compute the average time of completion taken by these runners.
 * Finally, print the name and number of years participated for each runner if the runner’s time of
 * completion is equal to or better than the average time of completion.

 */

/**
* Assignment1/Q4, COMP268
* Class: BanffMarathonRunner.java
* Purpose:to find the fastest runner by using the AddressBook class and a new method
* @author: Lei Feng
* Student ID: 3294132
* Date: July 19, 2016
* Version 1.0
* based on :David J. Eck, Hobart and William Smith Colleges(Version 6.0, June 2011),
* Introduction to Programming Using Java
*/
public class BanffMarathonRunner extends AddressBook {
    //declaration
    private int time;
    private int years;
    /**
     * main method
     * @param args 
     */
public static void main(String[] args) {
    //store all the runners data in array
    BanffMarathonRunner[] runners = new BanffMarathonRunner[] {
                                    new BanffMarathonRunner("Elena", "Brandon", 341, 1),
                                    new BanffMarathonRunner("Thomas", "Molson", 273, 2),
                                    new BanffMarathonRunner("Hamilton", "Winn", 278, 5),
                                    new BanffMarathonRunner("Suzie", "Sarandin", 329, 7),
                                    new BanffMarathonRunner("Philip", "Winne", 445, 9),
                                    new BanffMarathonRunner("Alex", "Trebok", 275, 3),
                                    new BanffMarathonRunner("Emma", "Pivoto", 275, 4),
                                    new BanffMarathonRunner("John", "Lenthen", 243, 1),
                                    new BanffMarathonRunner("James", "Lean", 334, 1),
                                    new BanffMarathonRunner("Jane", "Ostin", 412, 1),
                                    new BanffMarathonRunner("Emily", "Car", 393, 4),
                                    new BanffMarathonRunner("Daniel", "Hamshire", 299, 4),
                                    new BanffMarathonRunner("Neda", "Bazdar", 343, 3),
                                    new BanffMarathonRunner("Aaron", "Smith", 317, 6),
                                    new BanffMarathonRunner("Kate", "Hen", 265, 8) };
    //for loop,
    for (BanffMarathonRunner runnerA : runners) {
		runnerA.setHomeAddress(runnerA.getFirstName() + "'s home address set");
		}
                //create the fastest runner1
		BanffMarathonRunner fastest1 = BanffMarathonRunner.getFastestRunner(runners);
                
		System.out.printf(
                        "%s %s\n%s\n%d mins\n", 
                        //get the fastest runner's first name
                        fastest1.getFirstName(),
                        //get the fastest runner's last name
                        fastest1.getLastName(),
                        //get the fastest runner's home address
                        fastest1.getHomeAddress(),
                        //get the fastest runner's time
                        fastest1.getTime() );
                //create the second fastest runner2
		BanffMarathonRunner fastest2 = BanffMarathonRunner.getSecondFastestRunner(runners);
                //print message formately
		System.out.printf(
                        "%s %s\n%s\n%d mins\nThe difference in time with the fatest runner is : %d mins\n", 
                         //get the second fastest runner's first name
                        fastest2.getFirstName(),      
                        //get the second fastest runner's last name
                        fastest2.getLastName(),      
                        //get the second fastest runner's home address
                        fastest2.getHomeAddress(),        
                        //get the second fastest runner's time                       
                        fastest2.getTime(),                
                        //get the difference in time between the fastest runner and the second fastest runner
                        fastest2.getTime() - fastest1.getTime());
                
                //print formately
		System.out.printf("Runners above average is : %.2f mins\nAll the runner’s name and number of years are showing below:\n%s",
			//get average time of all runners
                        BanffMarathonRunner.getAverageTime(runners), 
                        //get above average time of all runners
                        BanffMarathonRunner.getAboveAverageRunners(runners));
	}
/**
 * 
 * @param fn first name 
 * @param ln last name 
 * @param min minutes 
 * @param yr years
 */
    public BanffMarathonRunner(String fn, String ln, int min, int yr) {
        super (fn, "", ln);
        
	this.time = min;
	this.years = yr;
        
	}
   /**
    * 
    * @return years
    */ 
    public int getYears() {
    return years;
    }
    /**
     * 
     * @return time
     */
    public int getTime() {
    return time;
    }
   
    /**
     * 
     * @param runners
     * @return fastest runner
     */
    public static BanffMarathonRunner getFastestRunner(BanffMarathonRunner[] runners) {
        
	BanffMarathonRunner fastesRunner = runners[0];
        //using for loop to find the fastest runner one by one
	for (int i = 1; i < runners.length; i++) {
            
            if (runners[i].getTime() < fastesRunner.getTime())
                
		fastesRunner = runners[i];  
		}
	return fastesRunner;
	}
    /**
     * 
     * @param runners
     * @return fastest runner2
     */
    public static BanffMarathonRunner getSecondFastestRunner(BanffMarathonRunner[] runners) {
        
	BanffMarathonRunner fastestRunner = runners[0];
	BanffMarathonRunner fastestRunner2 = fastestRunner;
        //using for loop to find the second fastest runner and compare their time with the fastest runner
	for (int i = 1; i < runners.length; i++) {
            if (runners[i].getTime() < fastestRunner.getTime()) {
                
                fastestRunner2 = fastestRunner;
                fastestRunner = runners[i];
                    
		} else if (runners[i].getTime() >= fastestRunner.getTime() && runners[i].getTime() < fastestRunner2.getTime()) {
                    
                    fastestRunner2 = runners[i];
                    
		} else if (fastestRunner == fastestRunner2) {
                    
                    fastestRunner2 = runners[i];
                    
			}
		}
        
	return fastestRunner2;
	}
    /**
     * using total time to devide by all the runners then 
     * get the average time
     * @param runners
     * @return total time / how many runners
     */
    public static double getAverageTime(BanffMarathonRunner[] runners) {
        
	if (runners == null || runners.length == 0)                  
            return 0;          
            double total1 = 0;
            //using for loop to add all the runners time    
            for (BanffMarathonRunner runnerA : runners) {
                
                total1 += runnerA.getTime();
                
		}
            //using division to get the average time
            return total1 / runners.length;
	}
    /**
     * to find how many runners above the average time
     * @param runners
     * @return runnerB
     */    
    public static String getAboveAverageRunners(BanffMarathonRunner[] runners) {
            
        String runnerB = "";
            
        double average = BanffMarathonRunner.getAverageTime(runners);
            
        for (BanffMarathonRunner runnerA : runners) {
                
            if (runnerA.getTime() <= average)
                
		runnerB += runnerA.getFirstName() + " "+ runnerA.getLastName() + " " + runnerA.getYears()+ "\n";
                
		}
	return runnerB;
	}

    /**
     * set years
     * @param years 
     */
    public void setYears(int years) {
    this.years = years;
    }
    /**
     * set time 
     * @param time 
     */
    public void setTime(int time) {
    this.time = time;
    }

}