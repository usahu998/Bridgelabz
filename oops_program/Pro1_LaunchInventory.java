package com.bridgelabz.oops_program;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Pro1_LaunchInventory 
{
	 public static void main(String[] args)
	    {
	        //JSON parser object to parse read file
	        JSONParser jsonParser = new JSONParser();
	         
	        try (FileReader reader = new FileReader("/home/admin1/Desktop/Json/Jlist.json"))
	        {
	            //Read JSON file
	            Object obj = jsonParser.parse(reader);
	 
	            JSONArray employeeList = (JSONArray) obj;
	          //  System.out.println(employeeList);
	             
	            //Iterate over employee array
	            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
	 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }
	 
	    private static void parseEmployeeObject(JSONObject employee)
	    {
	        //Get employee object within list
	        JSONObject employeeObject = (JSONObject) employee.get("employee");
	         
	        //Get employee  name
	        String name = (String) employeeObject.get("Name");   
	        System.out.println(name);
	         
	        //Get employee weight
	        String weight = (String) employeeObject.get("Weight"); 
	        System.out.println(weight
	        		
	        		
	        		
	        		);
	         
	        //Get employee website name
	        String website = (String) employeeObject.get("website");   
	        System.out.println(website);
	    }
	
}
