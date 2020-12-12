/**
 * * QUESTION NO - 1
 * This class to find duplicates from list and to find even number
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListHandling {

	private static List<Integer> uniqueList;
	
	@Test()
	/**
	 * This method is to find duplicates in the given list
	 * 	> An Integer array is created and converted that into an Integer List
	 *  > Created a new unique integer list by storing only unique elements from the original list 
	 */
	public void findDuplicates() {
		
		System.out.println("### To Find Duplicates in the given List ###");
		
		//** To declare the original list
		List<Integer> originalList = new ArrayList<Integer>();
		
		//** To create an integer array
		Integer[] intArray = {1,2,2,3,4,5,5,6,7,8,9,9,10};
		
		//** To convert the integer array to List
		for(Integer arrElement:intArray){  
			originalList.add(arrElement);  
			}  
		System.out.println("Original List >> "+originalList);

		//** Creating a new list to fetch only unique elements
         uniqueList = new ArrayList<Integer>();
         for(Integer ele:originalList){
              if(!uniqueList.contains(ele)){
            	  uniqueList.add(ele);
              }
          }
          System.out.println("Unique List >> "+uniqueList);
	}
	
	
	@Test
	/**
	 * This method is to find even elements from the uniquely identified list
	 * 	> The previously identified unique array is taken as input for this method
	 *  > Traversed through the list and even numbers are identified & added to a new list 
	 */
	public void findEvenNumber() {
		
		System.out.println("### To find even numbers from the above unique List ###");
		System.out.println("Unique List >> "+uniqueList);

		//** Creating a new list to fetch only even numbers
         List<Integer> evenList = new ArrayList<Integer>();
         for(Integer ele:uniqueList){
              if(ele % 2 == 0){
            	  evenList.add(ele);
              }
          }
          System.out.println("Even List >> "+evenList);
	}

}
