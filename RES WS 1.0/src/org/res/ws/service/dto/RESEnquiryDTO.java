package org.res.ws.service.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class RESEnquiryDTO {

	private String name;
	private String address1;
	private String colony;
	private String city;
	private List<Double> loc = new ArrayList<Double>();
	private Integer zip;
	private String state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	* 
	* @return
	* The address1
	*/
	public String getAddress1() {
	return address1;
	}
	
	/**
	* 
	* @param address1
	* The address1
	*/
	public void setAddress1(String address1) {
	this.address1 = address1;
	}
	
	/**
	* 
	* @return
	* The colony
	*/
	public String getColony() {
	return colony;
	}
	
	/**
	* 
	* @param colony
	* The colony
	*/
	public void setColony(String colony) {
	this.colony = colony;
	}
	
	/**
	* 
	* @return
	* The city
	*/
	public String getCity() {
	return city;
	}
	
	/**
	* 
	* @param city
	* The city
	*/
	public void setCity(String city) {
	this.city = city;
	}
	
	/**
	* 
	* @return
	* The loc
	*/
	public List<Double> getLoc() {
	return loc;
	}
	
	/**
	* 
	* @param loc
	* The loc
	*/
	public void setLoc(List<Double> loc) {
	this.loc = loc;
	}
	
	/**
	* 
	* @return
	* The zip
	*/
	public Integer getZip() {
	return zip;
	}
	
	/**
	* 
	* @param zip
	* The zip
	*/
	public void setZip(Integer zip) {
	this.zip = zip;
	}
	
	/**
	* 
	* @return
	* The state
	*/
	public String getState() {
	return state;
	}
	
	/**
	* 
	* @param state
	* The state
	*/
	public void setState(String state) {
	this.state = state;
	}

}