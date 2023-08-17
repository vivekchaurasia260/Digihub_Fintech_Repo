package com.org.digihub.vo;

import javax.persistence.Column;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "digi_app_employees")
public class DigiAppEmployeesVO {
	
	@Id()
	@Column(name = "user_id")
	String userId;
	@Column(name = "app_id")
	String appId;
	@Column(name = "employee_id")
	String employeeId;
	@Column(name = "employee_designation")
	String employeeDesignation;
	@Column(name = "employee_join_date")
	Timestamp employeeJoinDate;
	@Column(name = "employee_din")
	String employeeDin;
	
	
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public Timestamp getEmployeeJoinDate() {
		return employeeJoinDate;
	}
	public void setEmployeeJoinDate(Timestamp employeeJoinDate) {
		this.employeeJoinDate = employeeJoinDate;
	}
	public String getEmployeeDin() {
		return employeeDin;
	}
	public void setEmployeeDin(String employeeDin) {
		this.employeeDin = employeeDin;
	}
}
