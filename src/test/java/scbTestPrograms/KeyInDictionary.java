/**
 * This class to find whether the given key is present in the dictionary object
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import java.util.HashMap;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KeyInDictionary {
	
	//** Declaration and definitions of variables
	private static int key = 124;
	
	@Test()
	/**
	 * This method is to find whether the key is present in the has map
	 * 	And print the value if the key presents
	 */
	public void findKeyInDictionary() {
		
		System.out.println("### To find key is present in the given dictionary ###");
		
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
