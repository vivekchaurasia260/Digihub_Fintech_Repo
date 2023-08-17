package com.org.digihub.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "digi_app_document_details")
public class DigiAppDocumentDetailsVO {
	
	@Id()
	@Column(name = "user_id")
	String userId;
	@Column(name = "app_id")
	String appId;
	@Column(name = "document_id")
	String documentId;
	@Column(name = "document_name")
	String documentName;
	@Column(name = "document_status")
	String documentStatus;
	@Column(name = "ts_uploaded")
	Timestamp tsUploaded;
	@Column(name = "document_data")
	String documentData;
	
	
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
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentStatus() {
		return documentStatus;
	}
	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}
	public Timestamp getTsUploaded() {
		return tsUploaded;
	}
	public void setTsUploaded(Timestamp tsUploaded) {
		this.tsUploaded = tsUploaded;
	}
	public String getDocumentData() {
		return documentData;
	}
	public void setDocumentData(String documentData) {
		this.documentData = documentData;
	}
	
}
