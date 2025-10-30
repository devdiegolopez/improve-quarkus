package mx.chkry;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.logging.Logger;

@Path("/hello")
public class GreetingResource {
    Logger logger = Logger.getLogger(GreetingResource.class.getName());

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello(Object object) {
        logger.info(object.toString());
        return object ;
    }
}
