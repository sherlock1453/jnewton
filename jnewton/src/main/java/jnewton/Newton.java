package jnewton;

import org.json.simple.JSONObject;

public class Newton {
    public static double Cosine(String x){
        JSONObject resObj = Wrapper.makeRequest("cos",x);
        double res = Double.parseDouble((String)resObj.get("result"));
        return res;
    }
}
