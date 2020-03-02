package jnewton;

import org.json.simple.JSONObject;

public class Newton {
    public static String Cosine(String x){
        JSONObject resObj = Wrapper.makeRequest("cos",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String Sine(String x){
        JSONObject resObj = Wrapper.makeRequest("sin",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String Tangent(String x){
        JSONObject resObj = Wrapper.makeRequest("tan",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String AbsoluteValue(String x){
        JSONObject resObj = Wrapper.makeRequest("abs",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }

}
