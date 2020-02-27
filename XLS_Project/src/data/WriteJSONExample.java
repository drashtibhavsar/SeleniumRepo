package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WriteJSONExample {
	 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //First Employee
		        JSONObject employeeDetails = new JSONObject();		//created json object
		        employeeDetails.put("firstName", "drashti");		//obj name dot put method to write the data to the json
		        employeeDetails.put("lastName", "bhavsar");
		        employeeDetails.put("website", "howtodoinjava.com");
		         
		        JSONObject employeeObject = new JSONObject(); 		//created another obj of a json class
		        employeeObject.put("employee", employeeDetails);
		         
		        //Second Employee
		        JSONObject employeeDetails2 = new JSONObject();
		        employeeDetails2.put("firstName", "bhailu");
		        employeeDetails2.put("lastName", "bhavsar");
		        employeeDetails2.put("website", "example.com");
		         
		        JSONObject employeeObject2 = new JSONObject(); 
		        employeeObject2.put("employee", employeeDetails2);
		         
		        //Add employees to list
		        JSONArray employeeList = new JSONArray();
		        employeeList.add(employeeObject);
		        employeeList.add(employeeObject2);
		         
		        //Write JSON file
		        try (FileWriter file = new FileWriter("D:\\testing\\demo.json")) {
		 
		            file.write(employeeList.toJSONString());
		            file.flush();
		 
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        
		        //read JSON file
		        JSONParser jsonParser = new JSONParser();
		         
		        try (FileReader reader = new FileReader("D:\\testing\\demo.json"))
		        {
		            //Read JSON file
		            Object obj = jsonParser.parse(reader);
		            
		            employeeList = (JSONArray) obj;
		            System.out.println(employeeList);
		             
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
		         
		        //Get employee first name
		        String firstName = (String) employeeObject.get("firstName");    
		        System.out.println(firstName);
		         
		        //Get employee last name
		        String lastName = (String) employeeObject.get("lastName");  
		        System.out.println(lastName);
		         
		        //Get employee website name
		        String website = (String) employeeObject.get("website");    
		        System.out.println(website);
		    }
	}

