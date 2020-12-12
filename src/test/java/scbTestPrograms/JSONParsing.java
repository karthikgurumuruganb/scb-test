/**
 * This class to parse the given json object
 * @author Karthik
 * Date : 12/12/2020
 */

package scbTestPrograms;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JSONParsing {

//	private static List<Integer> uniqueList;
	
	@Test()
	/**
	 * This method is to parse the given json
	 */
	public void parseJSON() {
		
		System.out.println("### This  is to parse the given json ###");
		
		JSONObject obj = new JSONObject("{'1' : [{'a':'test'},{'b':'Yes'}]}, {'2' : [{'c':'testing'},{'d':'Yes'}]}, {'3' : [{'e':'testing'},{'f':'Yes'}]}");
		
		//** Fetcing the values from json object
		System.out.println(obj.getJSONArray("1"));
		System.out.println( "value of a is >> "+obj.getJSONArray("1").getJSONObject(0).getString("a"));
		System.out.println( "value of b is >> "+obj.getJSONArray("1").getJSONObject(1).getString("b"));
		
//		System.out.println(obj.getJSONArray("2"));
	
	}
	
	

}
