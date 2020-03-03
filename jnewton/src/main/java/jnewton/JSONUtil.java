package jnewton;

import org.json.simple.JSONObject;

public class JSONUtil {
    public static String getResult(JSONObject obj) {
        if (obj.containsKey("result")) {
            String res = (String) obj.get("result");
            return res;
        }
        return new String("NaN");
    }
    public static String getOperation(JSONObject obj) {
        if (obj.containsKey("operation")){
            String res = (String)obj.get("operation");
            return res;
        }
        return new String("NaN");
    }
    public static String getExpression(JSONObject obj) {
        String res = (String)obj.get("expression");
        return res;
    }
}
