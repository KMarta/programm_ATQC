package RestApi;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

class Client {
    Client client = (Client) ClientBuilder.newClient(new ClientConfig().register(LoggingFilter.class));

    WebTarget webTarget = client.target("http://localhost:8080/JerseyDemos/rest").path("employees");

    private WebTarget target(String s) {
        return null;
    }

    Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);

    private Object emp;
    Response response = invocationBuilder.post(Entity.entity(emp, MediaType.APPLICATION_XML));
}