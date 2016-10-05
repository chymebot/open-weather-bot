//	Generated using Unvired Modeller - Build R-4.000.0002
package org.openweathermap.api.pa;  

import org.openweathermap.api.gen.pa.ABSTRACT_COMMAND_CURRENTWEATHER;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.unvired.chyme.api.Message;
import com.unvired.ump.agent.IHTTPResponse;
 
public class COMMAND_CURRENTWEATHER extends ABSTRACT_COMMAND_CURRENTWEATHER {
	
    public void execute() {
    	
        try {        	
            String city = inputBE_CurrentWeather.getCurrentWeather_HEADER().getCITY();    
            
            String responseText = "";
            
            //  Call the REST API
            IHTTPResponse response = CURRENT_WEATHER(city, "");
            if(response.isSuccess()){
                JsonObject weatherJson = (JsonObject)new JsonParser().parse(response.getMessage());            
                String description = weatherJson.get("weather").getAsJsonArray().get(0).getAsJsonObject().get("description").getAsString();
                int temperature = weatherJson.get("main").getAsJsonObject().get("temp").getAsBigDecimal().intValue() - 273;            
                responseText = city + " Weather : " + description + ". Current temperature is " + temperature + " degree Celsius.";
            }
            else
                responseText = "Something went wrong. Please try again";              
            chymeAPI.setMessage(new Message(responseText));
        } catch (Exception e) {
        	chymeAPI.setMessage(new Message(e.getMessage()));        
        }
	}   
}