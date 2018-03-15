package com.soft.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Contract")
public class ContractEmployee  extends Employee{
	
	private float payperhour;
	public float getPayperhour() {
		return payperhour;
	}
	public ContractEmployee(float payperhour, String contractperiod) {
		
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
	}
	public ContractEmployee() {
		
		// TODO Auto-generated constructor stub
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
	private String contractperiod;

}
