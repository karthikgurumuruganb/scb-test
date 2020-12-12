/**
 * * QUESTION NO - 5
 * This class to remove multiple spaces from given String
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RemoveSpaceFromString {

	private static String givenString = " To Re move Mul tiple Spaces ";
	
	@Test()
	/**
	 * This method is to remove multiple spaces from the given strin 
	 */
	public void removeMultipleSpaces() {
		System.out.println("### To remove multiple spaces from String ###");
		System.out.println("Given String >> "+givenString);
        System.out.println("New String >> "+givenString.trim().replace(" ", ""));
	}
	
}
