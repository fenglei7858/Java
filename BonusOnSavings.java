/**
*@author Lei Feng
*/

import java.util.Arrays;

public class BonusOnSavings {
/**
 * 
 * @param args 
 */
	public static void main(String[] args) {
            //using given data to compute the total bonus amount in a year
		BonusOnSavings.computeBonus(2000,5000,7000,4000,8000);
		BonusOnSavings.computeBonus(3000,6000,9000,10000,17000);
	}

	/**
         * 
         * @param commitment
         * @param q1 quarter 1
         * @param q2 quarter 1
         * @param q3 quarter 1
         * @param q4 quarter 1
         * @return bonus
         */
	public static double computeBonus(double commitment, double q1, double q2, double q3, double q4) {
                
            //quarters saving in array
                double[] qs = {q1,q2,q3,q4};
            
		if (qs.length < 4) {
			System.out.println("Calculate savings of 4 quaters' bonus");
			return 0;
                }
                
		double bonus = 0;
		double sv = 0;
		double[] qbonus = new double[] { 0, 0, 0, 0 };
                
		for (int i = 0; i < 4; i++) {
                    //monthly commitment  x 3, quarterly bonus is 3%
			if (qs[i] >= commitment * 3) {
				qbonus[i] = qs[i] * 0.03;
				bonus += qbonus[i];
			}
			sv += qs[i];
		}
                //annual bonus is 5%
		if (sv >= commitment * 12) {
			bonus += sv * 0.05;
		}
                //additional savings 25% as part of the annual bonus.
		bonus +=  commitment * 12 * 0.25;
		System.out.printf(" Monthly commitment is %.2f\n quarterly savings are:%s\n", commitment, Arrays.toString(qs));
		System.out.printf(" Total bonus will be %.2f\n", bonus);
		return bonus;
	}
}

