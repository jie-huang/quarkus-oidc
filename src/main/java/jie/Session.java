package jie;

import java.net.URISyntaxException;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import io.quarkus.oidc.OidcSession;

@Path("/test")
public class Session {
  @Inject
  OidcSession oidcSession;

  @GET
  @Path("/login")
  @RolesAllowed("**")
  public Response login() throws URISyntaxException {
    return Response.ok("<!doctype html><html><head><title>test</title></head><body>login successfully</body></html>")
      .header("Content-Type", "text/html;charset=UTF-8").build();
  }
}
