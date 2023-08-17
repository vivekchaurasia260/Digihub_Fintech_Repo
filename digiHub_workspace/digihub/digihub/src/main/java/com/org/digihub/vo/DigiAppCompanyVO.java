package com.org.digihub.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "digi_app_company")
public class DigiAppCompanyVO {
	
	@Id
	@Column(name = "user_id")
	String userId;
	@Column(name = "app_id")
	String appId;
	@Column(name = "company_id")
	String companyId;
	@Column(name = "cin")
	String cin;
	@Column(name = "company_name")
	String companyName;
	@Column(name = "year_of_incorp")
	String yearOfIncorp;
	@Column(name = "industry_type")
	String industryType;
	@Column(name = "description")
	String description;
	@Column(name = "profit_loss")
	String profitLoss;
	@Column(name = "revenue_ops")
	String revenueOps;
	@Column(name = "head_office")
	String headOffice;
	@Column(name = "solution_category")
	String solutionCategory;
	@Column(name = "solution_ready")
	String solutionReady;
	@Column(name = "solution_desc")
	String solutionDesc;
	@Column(name = "solution_verticals")
	String solutionVerticals;
	@Column(name = "demo_ready")
	boolean demoReady;
	@Column(name = "demo_schedule_ts")
	Timestamp demoScheduleTs;
	
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
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getYearOfIncorp() {
		return yearOfIncorp;
	}
	public void setYearOfIncorp(String yearOfIncorp) {
		this.yearOfIncorp = yearOfIncorp;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProfitLoss() {
		return profitLoss;
	}
	public void setProfitLoss(String profitLoss) {
		this.profitLoss = profitLoss;
	}
	public String getRevenueOps() {
		return revenueOps;
	}
	public void setRevenueOps(String revenueOps) {
		this.revenueOps = revenueOps;
	}
	public String getHeadOffice() {
		return headOffice;
	}
	public void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
	}
	public String getSolutionCategory() {
		return solutionCategory;
	}
	public void setSolutionCategory(String solutionCategory) {
		this.solutionCategory = solutionCategory;
	}
	public String getSolutionReady() {
		return solutionReady;
	}
	public void setSolutionReady(String solutionReady) {
		this.solutionReady = solutionReady;
	}
	public String getSolutionDesc() {
		return solutionDesc;
	}
	public void setSolutionDesc(String solutionDesc) {
		this.solutionDesc = solutionDesc;
	}
	public String getSolutionVerticals() {
		return solutionVerticals;
	}
	public void setSolutionVerticals(String solutionVerticals) {
		this.solutionVerticals = solutionVerticals;
	}
	public boolean getDemoReady() {
		return demoReady;
	}
	public void setDemoReady(boolean demoReady) {
		this.demoReady = demoReady;
	}
	public Timestamp getDemoScheduleTs() {
		return demoScheduleTs;
	}
	public void setDemoScheduleTs(Timestamp demoScheduleTs) {
		this.demoScheduleTs = demoScheduleTs;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}



}
