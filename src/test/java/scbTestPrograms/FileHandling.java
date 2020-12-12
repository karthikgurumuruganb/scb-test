/**
 * This class to find member who has taken more than 10 books
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import java.io.File;
import java.util.HashMap;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FileHandling {
	
	//** Declaration and definitions of variables
	private static int key = 124;
	
	@Test()
	/**
	 * /**
	 * This method is to find the string occurrences in the given file
	 * 	> A string array is created by splitting the file using space
	 *  > Finding the Selenium keyword by traversing the entire array 
	 */
	 
	public void findMemberDetails() {
		
		System.out.println("### To find members who has taken more than 10 books ###");
		
		//** To load the file using relative path
		File file = new File("src/main/resources/testData/libraryRecords");
		
		//** To create a HashMap object - accounts
	    HashMap<Integer, String> accounts = new HashMap<Integer, String>();
		
	    //** To add keys and values (acctNo, name)
	    accounts.put(123, "Kartik");
	    accounts.put(456, "Guru");
	    accounts.put(789, "Murugan");
	    accounts.put(124, "Bala");
	    accounts.put(125, "Subramanian");
		
	    //** To find key and value
	    if (accounts.containsKey(key)) {
	    	System.out.println(">> Key is found !!");
	    	System.out.println(">> "+ accounts.get(key) + " is the value of the given key - "+key);
	    }else {
	    	System.out.println(">> Key is NOT found !!");
	    }
		
	}
	
	

}
