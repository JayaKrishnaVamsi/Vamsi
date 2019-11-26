package com.bhaiti.kela.beans;

import java.sql.Date;

public class registrationreply {
	String workid;
	String topic;
	String venue;
	Date date;
	int reg_fee;
	String organiser;
	String location;
	String status;
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getReg_fee() {
		return reg_fee;
	}
	public void setReg_fee(int reg_fee) {
		this.reg_fee = reg_fee;
	}
	public String getOrganiser() {
		return organiser;
	}
	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWorkid() {
		return workid;
	}
	public void setWorkid(String workid) {
		this.workid = workid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
