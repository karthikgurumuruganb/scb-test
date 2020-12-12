/*** QUESTION NO - 4
 * This class to find the member who has taken more than 10 books
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRecords {

	private static String Sheetname = "books";
	private static String fileNameAndPath = "src/main/resources/testData/libraryRecords.xlsx";
	@Test()
	/**
	 * This method is to find the member who has taken more than 10 books
	 */
	public void findMemberDetails() {
		
		System.out.println("### To find the member who has taken more than 10 books ###");
		
        try
        {
        	//** To load the file using relative path
    		FileInputStream  fileInput = new FileInputStream (fileNameAndPath);
            XSSFWorkbook wb = new XSSFWorkbook(fileInput);
            XSSFSheet sheetName = wb.getSheet(Sheetname);
            int rowCount = sheetName.getLastRowNum()-sheetName.getFirstRowNum();
            
            //** To print the table row by row
            for (int rowNum = 1; rowNum < rowCount+1; rowNum++) {
                Row row = sheetName.getRow(rowNum);
                //Create a loop to print cell values in a row
                for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                    //Print Excel data in console
                    System.out.print(row.getCell(colNum).getStringCellValue()+" | ");
                }
                System.out.println();
            } 
            
            //** To fetch member number who fetched more than 10 books
            for (int rowNum = 1; rowNum < rowCount+1; rowNum++) {
                Row row = sheetName.getRow(rowNum);
                //Create a loop to print cell values in a row
                for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                    if (Integer.parseInt(row.getCell(1).getStringCellValue()) > 10) {
                    	System.out.print("  >> Member Number "+ row.getCell(0).getStringCellValue() + " taken "+ row.getCell(1).getStringCellValue() + " books");
                    	break;
                    }
                }
                System.out.println();
            } 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
     }

}
