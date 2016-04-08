import java.io.FileWriter;
import java.io.IOException

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON {
	public static void main(string[] args) {
	
		JSONObject obj = new JSONObject();
		obj.put("name", "Bill Laimbeer");
		obj.put("jerseyNumber", new Integer(40));
		
		JSONArray list = new JSONArray();
		list.add("Detroit");
		list.add("Bad");
		list.add("Boy");
		
		obj.put("notes", list);
		
		try {
		
		
			//location for file needs to be specified before running
			FileWriter file = new FileWriter("#location");
			file.write(obj.toJSONString());
			file.flush();
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print(obj);
		
		system.out.print(obj);
		
}
}