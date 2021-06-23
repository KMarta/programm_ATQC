package Basic;

// TASK 9: Create string that contains JSON { "name":"John", "age":30, "car":null };
// parse this string into JSON object and print it's name and age.


import org.json.JSONException;
import org.json.JSONObject;

public class Task9 {

    public static void main(String[] args) {
        try {
            String json = "{'name': 'John', "
                    + "'age': '30',"
                    + "'cars': 'null',}";

            JSONObject jsonObject = new JSONObject(json);
            System.out.println("JSONOBJECT : " + jsonObject.get("name"));
            System.out.println("JSONOBJECT : " + jsonObject.get("age"));
        } catch (JSONException err) {
            System.out.println("Exception : " + err.toString());
        }
    }
}










