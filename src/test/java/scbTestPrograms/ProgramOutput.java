/**
 * This class to find the output of the program with reasons
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
 class ProgramOutputSuper {
	public int index = 1;
}

public class ProgramOutput extends ProgramOutputSuper{
	public ProgramOutput(int index) {
		index = index; 
	}
	public static void main (String[] args	) {
		ProgramOutput prog = new ProgramOutput(10);
		System.out.println("Index >> "+ prog.index);
		System.out.println("REASON >> prog.index is a class variable hence it is taken value from Super");
	}
	
}