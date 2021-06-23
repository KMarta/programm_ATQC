package RestApi;

import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;
import javax.ws.rs.PUT;
import static io.restassured.RestAssured.given;

// create Put request
public class Test_PUT {

    @PUT
    @Test
    public void test_2_put() {

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
