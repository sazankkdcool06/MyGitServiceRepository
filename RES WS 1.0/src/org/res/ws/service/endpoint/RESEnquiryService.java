package org.res.ws.service.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("RESWS/1.0")
public interface RESEnquiryService {
	
	@GET
	@Path("ENQUIRY/{userID}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getDetails(@PathParam("userID") String uid,
							   @HeaderParam("appID") long appId,
							   @HeaderParam("password") String passwd);
}
