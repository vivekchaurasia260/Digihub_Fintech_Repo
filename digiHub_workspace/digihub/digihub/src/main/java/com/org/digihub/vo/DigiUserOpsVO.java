package com.org.digihub.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "digi_user_ops")
public class DigiUserOpsVO {
	
	@Id
	@Column(name = "user_id")
	String userId;
	@Column(name = "first_name")
	String firstName;
	@Column(name = "last_name")
	String lastName;
	@Column(name = "employee_id")
	String employeeId;
	@Column(name = "department")
	String department;
	@Column(name = "designation")
	String designation;
	@Column(name = "password")
	String password;
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
