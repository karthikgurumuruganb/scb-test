/**
 * QUESTION NO - 8
 * This class to parse the given XML object and compare it to DB
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class XMLParsing {

//	private static List<Integer> uniqueList;
	private static String fileNameAndPath = "src/main/resources/testData/employees.xml";
	
	@Test()
	/**
	 * This method is to parse the given json
	 */
	public void parseXML() throws ParserConfigurationException, SAXException, IOException {
		
		System.out.println("### This  is to parse XML and compare it with DB ###");
		
		//** To get Document Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		 
		//** To build Document
		Document document = builder.parse(new File(fileNameAndPath));
		 
		//** To normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();
		 
		//Here comes the root node
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		 
		//Get all employees
		NodeList nList = document.getElementsByTagName("employee");
		System.out.println("============================");
		 
		for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		 System.out.println("");    //Just a separator
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		    System.out.println("Employee id : "    + eElement.getAttribute("id"));
		    System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
		    System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
		    System.out.println("Location : "    + eElement.getElementsByTagName("location").item(0).getTextContent());
		 }
		}
		
		
	
	}
	
	

}
