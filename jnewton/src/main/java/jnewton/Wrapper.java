package jnewton;

import java.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 


public class Wrapper
{
    private static String[] endpoints;
    public static class LocalWrapper
    {
        //TODO: Make LocalWrapper
    }
    
    Wrapper()
    {
        Wrapper.endpoints = new String[]{"simplify", "factor", "derive", "integrate", "zeroes", "tangent",
        "area", "cos", "sin", "tan", "arccos", "arcsin", "arctan", "abs",
        "log"};
    }
    public static String[] getValidEndpoints()
    {
        return endpoints;
    }
    public static JSONObject makeRequest(String endpoint, String params)
    {
        String path ='/'+ endpoint + '/'+ params + '/';
        
        try {
            URL apiEndP = new URL("https","newton.now.sh",path);
            HttpURLConnection conn = (HttpURLConnection) apiEndP.openConnection();
		    conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

            String output;
            StringBuffer response = new StringBuffer();
            
            while ((output = br.readLine()) != null) {
                response.append(output);
            }
            conn.disconnect();
            JSONObject responseObj = (JSONObject) new JSONParser().parse(response.toString());

            //System.out.println("Output from Server .... \n" + response.toString());
            if (responseObj.containsKey("error"))
            {
                return new JSONObject();
            }
            return responseObj;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new JSONObject();
    }
}
