package ConverttoJsontoJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

public class ConvertJsontoJava{
	
public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
	        ObjectMapper om = new ObjectMapper() {
			
			public Object serialize(ObjectMapperSerializationContext context) {
				
				return null;
			}
			
			public Object deserialize(ObjectMapperDeserializationContext context) {
				
				return null;
			}
		};
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//target//Accounting&SalesInformation.json");
		
		MainClass details = om.readValue(fis,MainClass.class);
		System.out.println(details.getAccounting().size());
		System.out.println(details.getSales().size());
		String Accountemp =  details.getAccounting().get(0).getFirstName();
		System.out.println(Accountemp);
		String Salesemp = details.getSales().get(0).getLastName();
		System.out.println(Salesemp);
		
		String jsonstring = om.writerWithDefaultPrettyPrinter().writeValueAsString(details);
	    System.out.println(jsonstring);
	    
//	    Accounting ac = new Accounting();
//	    System.out.println(ac);
//	    Sales sales = new Sales();
//	    System.out.println(sales);
		
	}		
		
}

