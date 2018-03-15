package com.soft.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
/*Inheritance strtegey*/
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Employee_Type",discriminatorType=DiscriminatorType.STRING)
@Table(name="inhemp_singletable")
public class Employee {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;

}
