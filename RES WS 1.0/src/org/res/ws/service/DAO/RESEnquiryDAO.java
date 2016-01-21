package org.res.ws.service.DAO;


import java.io.IOException;

import javax.annotation.Resource;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.res.ws.service.dto.RESEnquiryDTO;
import org.res.ws.service.mongo.config.SpringMongoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;



@Repository
public class RESEnquiryDAO {
	
//	@Resource(name="mongoTemplate")
	@Autowired(required=true)
	private MongoOperations operation;
	
//	@Autowired
//	private MongoTemplate mongoTemplate;
	
	public RESEnquiryDTO getRESEnquiryDetails(String uid){
		RESEnquiryDTO enquiryResults = null;
		RESEnquiryDTO enquiryMongoResults = null;
		String jsonString = "{\"address1\":\"Rly Qrs No 401A\",\"colony\":\"New Colony\",\"city\":\"Bongaigaon\",\"loc\":[ -72.622739,42.070206],\"zip\":783380,\"state\":\"Assam\"}";
		ObjectMapper mapper = new ObjectMapper();

//		enquiryResults  = gson.fromJson(jsonString, RESEnquiryDTO.class);
		try {
//			System.out.println(new File("sample.json").exists());
//			enquiryResults = mapper.readValue(new File("sample.json"), RESEnquiryDTO.class);
			enquiryResults = mapper.readValue(jsonString, RESEnquiryDTO.class);
			
//			ApplicationContext ctx = 
//		             new AnnotationConfigApplicationContext(SpringMongoConfig.class);
//			
//			operation = ctx.getBean("mongoTemplate",MongoOperations.class);
			Query searchQuery  = new Query(Criteria.where("name").is(uid));
			
			System.out.println(searchQuery);
			enquiryMongoResults = operation.findOne(searchQuery, RESEnquiryDTO.class);
			System.out.println(enquiryMongoResults.getAddress1());
			System.out.println(enquiryMongoResults.getCity());
			
		} 
		catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return enquiryMongoResults;
	}

}
