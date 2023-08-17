package com.org.digihub.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "digi_app_header")
public class DigiAppHeaderVO {

	@Id
	@Column(name = "user_id")
	String userId;
	@Column(name = "company_id")
	String companyId;
	@Column(name = "app_id")
	String appId;
	@Column(name = "app_start_date")
	Timestamp appStartDate;
	@Column(name = "app_end_date")
	Timestamp appEndDate;
	@Column(name = "app_status")
	String appStatus;
	@Column(name = "review1_status")
	String review1Status;
	@Column(name = "review1_result")
	String review1Result;
	@Column(name = "review1_user")
	String review1User;
	@Column(name = "review1_date")
	Timestamp review1Date;
	@Column(name = "review2_status")
	String review2Status;
	@Column(name = "review2_result")
	String review2Result;
	@Column(name = "review2_user")
	String review2User;
	@Column(name = "review2_date")
	Timestamp review2Date;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Timestamp getAppStartDate() {
		return appStartDate;
	}

	public void setAppStartDate(Timestamp appStartDate) {
		this.appStartDate = appStartDate;
	}

	public Timestamp getAppEndDate() {
		return appEndDate;
	}

	public void setAppEndDate(Timestamp appEndDate) {
		this.appEndDate = appEndDate;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getReview1Status() {
		return review1Status;
	}

	public void setReview1Status(String review1Status) {
		this.review1Status = review1Status;
	}

	public String getReview1Result() {
		return review1Result;
	}

	public void setReview1Result(String review1Result) {
		this.review1Result = review1Result;
	}

	public String getReview1User() {
		return review1User;
	}

	public void setReview1User(String review1User) {
		this.review1User = review1User;
	}

	public Timestamp getReview1Date() {
		return review1Date;
	}

	public void setReview1Date(Timestamp review1Date) {
		this.review1Date = review1Date;
	}

	public String getReview2Status() {
		return review2Status;
	}

	public void setReview2Status(String review2Status) {
		this.review2Status = review2Status;
	}

	public String getReview2Result() {
		return review2Result;
	}

	public void setReview2Result(String review2Result) {
		this.review2Result = review2Result;
	}

	public String getReview2User() {
		return review2User;
	}

	public void setReview2User(String review2User) {
		this.review2User = review2User;
	}

	public Timestamp getReview2Date() {
		return review2Date;
	}

	public void setReview2Date(Timestamp review2Date) {
		this.review2Date = review2Date;
	}

}
