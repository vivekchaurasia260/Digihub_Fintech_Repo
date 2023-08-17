package com.org.hubprod.vo;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "hub_prod_api_trail")
public class HubProdApiTrailVO {
	@Id
	@Column(name = "user_id")
	String userId;
	@Column(name = "app_id")
	String appId;
	@Column(name = "prod_id")
	String prodId;
	@Column(name = "api_id")
	String apiId;
	@Column(name = "api_name")
	String apiName;
	@Column(name = "api_path")
	String apiPath;
	@Column(name = "api_req_time")
	Timestamp apiReqTime;
	@Column(name = "api_res_time")
	Timestamp apiResTime;
	@Column(name = "api_status")
	String apiStatus;
	@Column(name = "api_error_code")
	String apiErrorCode;
	@Column(name = "api_desc")
	String apiDesc;
	
	
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
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getApiPath() {
		return apiPath;
	}
	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}
	public Timestamp getApiReqTime() {
		return apiReqTime;
	}
	public void setApiReqTime(Timestamp apiReqTime) {
		this.apiReqTime = apiReqTime;
	}
	public Timestamp getApiResTime() {
		return apiResTime;
	}
	public void setApiResTime(Timestamp apiResTime) {
		this.apiResTime = apiResTime;
	}
	public String getApiStatus() {
		return apiStatus;
	}
	public void setApiStatus(String apiStatus) {
		this.apiStatus = apiStatus;
	}
	public String getApiErrorCode() {
		return apiErrorCode;
	}
	public void setApiErrorCode(String apiErrorCode) {
		this.apiErrorCode = apiErrorCode;
	}
	public String getApiDesc() {
		return apiDesc;
	}
	public void setApiDesc(String apiDesc) {
		this.apiDesc = apiDesc;
	}
	
}
