package genericUtitiles;

import java.util.Random;
/**
 * 
 * @author dhanu
 *
 */
public class javaUtility {
	/**
	 * This method is used to generate random number in the given range
	 * @param range
	 * @return
	 */
	public int generateRandomNumber(int range) {
		Random r=new Random();
		 return r.nextInt(range);
	}

}
