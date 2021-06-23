package RestApi;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import javax.ws.rs.POST;

import static io.restassured.RestAssured.*;

// create Post request
public class Test_POST {

    @POST
    @Test

    public void test_1_post() {

        JSONObject request = new JSONObject();

        request.put("name", "Mary");
        request.put("job", "Manager");

        System.out.println(request);

        given().body(request.toString()).
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                post("https://reqres.in/api/users").then().
                statusCode(201);

    }

}
