/**
 * * QUESTION NO - 9
 * This class to find an Asian employee whose cummulative sales is > 1000
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SalesAndEmployees {

	private static String fileNameAndPath = "src/main/resources/testData/employeeRecords.xlsx";
	@Test()
	/**
	 * This method is to find the member who has taken more than 10 books
	 */
	public void findMemberDetails() throws FilloException {
		
		System.out.println("### This class to find an Asian employee whose cummulative sales is > 1000 ###");
		
		//** Initializing Fillo to access excel as DB
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection(fileNameAndPath);
		
		//** To find the sum of sales of each employee
		char empId[] = {'1', '2', '3'};
		HashMap<String, Integer> salesValue = new HashMap<String, Integer>();
		String largestSaleEmp = null;
		
		for (char emp : empId) {
			String strQuery="Select * from sales where emp_id='"+emp+"'";
			Recordset recordset=connection.executeQuery(strQuery);
			System.out.println(recordset.getFieldNames());
			
			int quantity=0;
			while(recordset.next()){
				quantity = quantity + Integer.parseInt(recordset.getField("qty"));
				}
			//** Mapping the total sales of each person
			salesValue.put(recordset.getField("emp_id"), quantity);
			System.out.println(quantity);
		}
		
		//** Looping find the largest sale value
		int maxValueInMap=(Collections.max(salesValue.values()));  // This will return max value in the Hashmap
        for (Entry<String, Integer> entry : salesValue.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
            	largestSaleEmp = entry.getKey();
            }
        }
		
        System.out.println(">> "+largestSaleEmp);
		
        //***********************************************************************
        
		//** To find NAME and COUNTRY of the employee
        String strQuery="Select * from employee where emp_id='"+largestSaleEmp+"'";
        Recordset recordset=connection.executeQuery(strQuery);
        
        String largestSaleEmpName = null,largestSaleEmpCountry = null;
        while(recordset.next()){
        	largestSaleEmpName = recordset.getField("name");
            largestSaleEmpCountry = recordset.getField("country");
			}
        System.out.println("Largest Sale Employee Name    >> "+largestSaleEmpName);
        System.out.println("Largest Sale Employee Country >> "+largestSaleEmpCountry);
        
        
      //***********************************************************************
        
        //** To find the CONTINENT of the largest sales employee
        strQuery="Select * from country where country='"+largestSaleEmpCountry+"'";
        recordset=connection.executeQuery(strQuery);
        String largestSaleEmpContinent = null;
        while(recordset.next()){
        	largestSaleEmpContinent = recordset.getField("continent");
        }
        
        System.out.println("Largest Sale Employee continent >> "+largestSaleEmpContinent);
        
     }

}
