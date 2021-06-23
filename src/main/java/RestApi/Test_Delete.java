package RestApi;

import org.testng.annotations.Test;
import javax.ws.rs.PUT;
import static io.restassured.RestAssured.when;

// create Delete request
public class Test_Delete {

    @PUT
    @Test
    public void test_3_delete() {

        when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204);

    }

}


