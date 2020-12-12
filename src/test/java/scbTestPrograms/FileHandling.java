/**
 * This method is to find the string occurrences in the given file
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForGivenType;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FileHandling {
	
	//** Declaration and definitions of variables
	private static String fileNameAndPath = "src/main/resources/testData/sampleFileToRead";
	private static String stringToBeFound = "Selenium";
	
	@Test()
	/**
	 * This method is to find the string occurrences in the given file
	 * 	> A string array is created by splitting the file using space
	 *  > Finding the Selenium keyword by traversing the entire array 
	 */
	 
	public void findStringInFile() {
		
		System.out.println("### To find the string occurrences in the given file ###");
		
		//** To load the file using relative path
		File file = new File(fileNameAndPath);
		
		try {
		    Scanner scanner = new Scanner(file);

		    //** declations
		    int lineNum = 0;
		    int wordCount =0;
		    
		   //** To read the file line by line...
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine();
		        System.out.println(line);
		        String[] texts = line.split(" ");
		        for (String text:texts) {
		        	if(text.equalsIgnoreCase(stringToBeFound)) {
		        		wordCount= wordCount + 1;
		        	}
		        }
		      lineNum++;
		    }
		    
		    System.out.println("The given word "+stringToBeFound+ " appears "+ wordCount +" times");
		    
		} catch(FileNotFoundException e) { 
		    System.out.println("File Not found in the given location!!");
		}
		
		
	}
	
	

}
