package org.res.ws.service.DAO;

import org.res.ws.service.dto.RESEnquiryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class RESEnquiryDAO {
	@Autowired(required=true)
	private MongoOperations operation;
	
	public RESEnquiryDTO getRESEnquiryDetails(String uid){
		RESEnquiryDTO enquiryMongoResults = null;
		Query searchQuery  = new Query(Criteria.where("name").is(uid));
			
		System.out.println(searchQuery);
		enquiryMongoResults = operation.findOne(searchQuery, RESEnquiryDTO.class);
		System.out.println(enquiryMongoResults.getAddress1());
		System.out.println(enquiryMongoResults.getCity());
			
		return enquiryMongoResults;
	}

}
