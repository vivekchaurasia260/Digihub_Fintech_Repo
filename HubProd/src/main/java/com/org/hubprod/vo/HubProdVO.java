package com.org.hubprod.vo;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "hub_prod")
public class HubProdVO {
	
	@Id
	@Column(name = "user_id")
	String userId;
	@Column(name = "app_id")
	String appId;
	@Column(name = "prod_id")
	String prodId;
	@Column(name = "organization")
	String organization;
	@Column(name = "first_name")
	String firstName;
	@Column(name = "last_name")
	String lastName;
	@Column(name = "start_date_time")
	Timestamp startDateTime;
	@Column(name = "end_date_time")
	Timestamp endDateTime;
	@Column(name = "authentication_type")
	String authenticationType;
	@Column(name = "whitelisted_IP")
	String whitelistedIP;
	
	
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
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Timestamp getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Timestamp startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Timestamp getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Timestamp endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public String getWhitelistedIP() {
		return whitelistedIP;
	}
	public void setWhitelistedIP(String whitelistedIP) {
		this.whitelistedIP = whitelistedIP;
	}
	
}
