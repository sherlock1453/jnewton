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
    public static String Simplify(String x){
        JSONObject resObj = Wrapper.makeRequest("simplify",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String Factor(String x){
        JSONObject resObj = Wrapper.makeRequest("factor",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String Derive(String x){
        JSONObject resObj = Wrapper.makeRequest("derive",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String Integrate(String x){
        JSONObject resObj = Wrapper.makeRequest("integrate",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String Zeroes(String x){
        JSONObject resObj = Wrapper.makeRequest("zeroes",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String AreaUnderCurve(String x){
        JSONObject resObj = Wrapper.makeRequest("area",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String ArcCos(String x){
        JSONObject resObj = Wrapper.makeRequest("arccos",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String ArcSin(String x){
        JSONObject resObj = Wrapper.makeRequest("arcsin",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String ArcTan(String x){
        JSONObject resObj = Wrapper.makeRequest("arctan",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
    public static String Logarithm(String x){
        JSONObject resObj = Wrapper.makeRequest("log",x);
        if (resObj.isEmpty())
        {
            return new String("NaN");
        }
        String res = (String)JSONUtil.getResult(resObj);
        return res;
    }
}
