package com.soft.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Regular")
public class RegularEmployee  extends Employee{
private float sallary;
public float getSallary() {
	return sallary;
}
public void setSallary(float sallary) {
	this.sallary = sallary;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
public RegularEmployee() {
	
	// TODO Auto-generated constructor stub
}
public RegularEmployee(float sallary, int bonus) {
	
	this.sallary = sallary;
	this.bonus = bonus;
}
private int bonus;
}
