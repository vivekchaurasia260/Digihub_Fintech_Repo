package com.org.hubprod.vo;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "hub_prod_security")
public class HubProdSecurityVO {
	@Id
	@Column(name = "user_id")
	String userId;
	@Column(name = "app_id")
	String appId;
	@Column(name = "prod_id")
	String prodId;
	@Column(name = "cbs_system")
	String cbsSystem;
	@Column(name = "cbs_module_id")
	String cbsModuleId;
	@Column(name = "security_type")
	String securityType;
	@Column(name = "security_key")
	String securityKey;
	@Column(name = "key_validity_start_time")
	Timestamp keyValidityStartTime;
	@Column(name = "key_validity_end_time")
	Timestamp keyValidityEndTime;
	@Column(name = "ts_created")
	Timestamp tsCreated;
	@Column(name = "ts_updated")
	Timestamp tsUpdated;
	
	
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
	public String getCbsSystem() {
		return cbsSystem;
	}
	public void setCbsSystem(String cbsSystem) {
		this.cbsSystem = cbsSystem;
	}
	public String getCbsModuleId() {
		return cbsModuleId;
	}
	public void setCbsModuleId(String cbsModuleId) {
		this.cbsModuleId = cbsModuleId;
	}
	public String getSecurityType() {
		return securityType;
	}
	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}
	public String getSecurityKey() {
		return securityKey;
	}
	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}
	public Timestamp getKeyValidityStartTime() {
		return keyValidityStartTime;
	}
	public void setKeyValidityStartTime(Timestamp keyValidityStartTime) {
		this.keyValidityStartTime = keyValidityStartTime;
	}
	public Timestamp getKeyValidityEndTime() {
		return keyValidityEndTime;
	}
	public void setKeyValidityEndTime(Timestamp keyValidityEndTime) {
		this.keyValidityEndTime = keyValidityEndTime;
	}
	public Timestamp getTsCreated() {
		return tsCreated;
	}
	public void setTsCreated(Timestamp tsCreated) {
		this.tsCreated = tsCreated;
	}
	public Timestamp getTsUpdated() {
		return tsUpdated;
	}
	public void setTsUpdated(Timestamp tsUpdated) {
		this.tsUpdated = tsUpdated;
	}
}
