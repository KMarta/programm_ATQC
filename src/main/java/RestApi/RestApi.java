package RestApi;


import org.junit.jupiter.api.Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

class Tests_GET{

    @GET
    @Path("https://reqres.in/api/users")
    @Test
    public void test_1(){
        given().
                header("Content-Type", "application/json").
                get("https://reqres.in/api/users?page=2").
                then().statusCode(200).
                body("data.id[1]", equalTo(8)).
                body("data.first_name", hasItems("Michael", "Lindsay"));
    }
}
