package issue;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/issue")
public class IssueEndpoint {

  @ConfigProperty(name = "from.env")
  boolean from_env;

  @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public boolean from_env() {
        return from_env;
    }

}