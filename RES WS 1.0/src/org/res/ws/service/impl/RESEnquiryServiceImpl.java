package org.res.ws.service.impl;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.res.ws.service.endpoint.RESEnquiryService;
import org.res.ws.service.processor.RESEnquiryProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("RESWS/1.0")
public class RESEnquiryServiceImpl implements RESEnquiryService{

	@Autowired
//	@Resource(name="enqProcessor")
	private RESEnquiryProcessor enqProcessor;
	
//	public RESEnquiryProcessor getEnqProcessor() {
//		return enqProcessor;
//	}
	
//	@Resource(name="enqProcessor")
//	public void setEnqProcessor(RESEnquiryProcessor enqProcessor) {
//		System.out.println("Setting enqProcessor");
//		this.enqProcessor = enqProcessor;
//	}

	@Override
	public Response getDetails(String uid, long appId, String passwd) {
		System.out.println("Here : "+uid);
//		enqProcessor = new RESEnquiryProcessor();
//		System.out.println(enqProcessor.fetchRESEnquiryDetails());
		
		if(appId != 101 || !passwd.equals("Sanjali")){
			return Response.noContent().entity("AppId & Password authentication failed").build();
		}
		System.out.println(this.enqProcessor.fetchRESEnquiryDetails(uid));
		return Response.ok(this.enqProcessor.fetchRESEnquiryDetails(uid), MediaType.APPLICATION_JSON).build();
	}
	
}
