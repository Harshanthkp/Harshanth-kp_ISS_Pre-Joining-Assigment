// JSON reader for getting the datas from the file.

import java.util.*;
import java.io.*;
import java.io.FileReader;
import org.json.simple.*;
import org.json.simple.parser.*;


public class JSONReader {
	
	public JSONObject getJSONFileObject(String filepath) {
		
		try {     
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(filepath));
            return  (JSONObject) obj;
        
        }catch(Exception e) {
        	e.printStackTrace();
        	
        }
		return null;
		
	}
    
    public static void main(String[] args) {
    	
    	JSONReader reader = new JSONReader();
    	JSONObject json = reader.getJSONFileObject("C:\\Users\\harsh\\eclipse-workspace\\jsonfiles\\src\\json_file.json");
    	System.out.println(json);
    	System.out.println(json.getOrDefault("interns", "Key Not Found"));
    	
    }

}
