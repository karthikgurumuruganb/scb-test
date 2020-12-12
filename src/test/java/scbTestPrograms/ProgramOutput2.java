/**
 * * QUESTION NO - 6 - B
 * This class to find the output of the program with reasons
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
 
public class ProgramOutput2 {
	
	public static void main (String args[]) throws IOException {
		char bit; 
		@SuppressWarnings("resource")
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		do {
			bit = (char) console.read();
			System.out.println(bit);
		}while (bit != '\'');
	}
	
}