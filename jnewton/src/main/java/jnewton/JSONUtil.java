package jnewton;

import org.json.simple.JSONObject;

public class JSONUtil {
    public static String getResult(JSONObject obj) {
            String res = (String)obj.get("result");
            return res;
    }
    public static String getOperation(JSONObject obj) {
        String res = (String)obj.get("operation");
        return res;
    }
    public static String getExpression(JSONObject obj) {
        String res = (String)obj.get("expression");
        return res;
    }
}
