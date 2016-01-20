package org.res.ws.service.processor;

import org.res.ws.service.DAO.RESEnquiryDAO;
import org.res.ws.service.dto.RESEnquiryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RESEnquiryProcessor {
	
	@Autowired
	private RESEnquiryDAO resEnquiry;
	
	public RESEnquiryDTO fetchRESEnquiryDetails(String userId){
		return resEnquiry.getRESEnquiryDetails(userId);
	}
}
