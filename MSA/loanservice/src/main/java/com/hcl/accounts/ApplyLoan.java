package com.hcl.accounts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application_data")
public class ApplyLoan {
	private static final long SerialVersionUID=1L;
	@Id
	@Column(name="userid")
	private int userId;
	@Column(name="name")
	private String name;
	@Column(name="loanAmount")
	private int loanAmount;
	@Column
	private String propertyType;
	@Column
	private float propertyAmount;
	@Column
	private int civicScore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public float getPropertyAmount() {
		return propertyAmount;
	}
	public void setPropertyAmount(float propertyAmount) {
		this.propertyAmount = propertyAmount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCivicScore() {
		return civicScore;
	}
	public void setCivicScore(int civicScore) {
		this.civicScore = civicScore;
	}
	public ApplyLoan(int userId, String name, int loanAmount, String propertyType, float propertyAmount,
			int civicScore) {
		super();
		this.userId = userId;
		this.name = name;
		this.loanAmount = loanAmount;
		this.propertyType = propertyType;
		this.propertyAmount = propertyAmount;
		this.civicScore = civicScore;
	}
	public ApplyLoan() {
		super();
	}
	
	
	
}
