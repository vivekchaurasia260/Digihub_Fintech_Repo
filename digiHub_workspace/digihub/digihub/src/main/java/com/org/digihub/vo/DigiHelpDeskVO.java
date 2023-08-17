package com.org.digihub.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "digi_help_desk")
public class DigiHelpDeskVO {

	@Id
	@Column(name = "user_id")
	String userId;
	@Column(name = "app_id")
	String appId;
	@Column(name = "timeslot")
	Timestamp timeslot;
	@Column(name = "contact_number")
	String contactNumber;
	@Column(name = "user_title")
	String userTitle;
	@Column(name = "full_name")
	String fullName;
	@Column(name = "user_comments")
	String userComments;
	
	public Timestamp getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(Timestamp timeslot) {
		this.timeslot = timeslot;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getUserTitle() {
		return userTitle;
	}
	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserComments() {
		return userComments;
	}
	public void setUserComments(String userComments) {
		this.userComments = userComments;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	}
