package com.org.hubprod.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hub_sandbox_control")
public class HubSandboxControlVO {
	@Id
	@Column(name="user_id ")
	String userId ;
	
	@Column(name="app_id ")
	String appId ;
	
	@Column(name="sandbox_id ")
	String sandboxId ;
	
	@Column(name="control_name ")
	String controlName ;
	
	@Column(name="control_value ")
	String controlValue ;

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

	public String getControlName() {
		return controlName;
	}

	public void setControlName(String controlName) {
		this.controlName = controlName;
	}

	public String getControlValue() {
		return controlValue;
	}

	public void setControlValue(String controlValue) {
		this.controlValue = controlValue;
	}
	

}
