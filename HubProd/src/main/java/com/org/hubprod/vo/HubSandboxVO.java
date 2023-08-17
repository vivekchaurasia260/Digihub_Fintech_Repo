package com.org.hubprod.vo;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hub_sandbox")
public class HubSandboxVO {
	
	@Id
	@Column(name="user_id ")
	String userId ;
	
	@Column(name="app_id ")
	String appId ;
	
	@Column(name="sandbox_id ")
	String sandboxId ;
	
	@Column(name="organization ")
	String organization ;
	@Column(name="first_name ")
	String firstName ;
	
	@Column(name="last_name ")
	String lastName ;
	
	@Column(name="start_date_time ")
	Timestamp startDateTime ;
	
	@Column(name="end_date_time ")
	Timestamp endDateTime ;
	
	@Column(name="Authentication_type ")
	String AuthenticationType ;
	
	@Column(name="Whitelisted_ip ")
	String WhitelistedIp ;

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

	public String getSandboxId() {
		return sandboxId;
	}

	public void setSandboxId(String sandboxId) {
		this.sandboxId = sandboxId;
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
		return AuthenticationType;
	}

	public void setAuthenticationType(String authenticationType) {
		AuthenticationType = authenticationType;
	}

	public String getWhitelistedIp() {
		return WhitelistedIp;
	}

	public void setWhitelistedIp(String whitelistedIp) {
		WhitelistedIp = whitelistedIp;
	}
	

}
