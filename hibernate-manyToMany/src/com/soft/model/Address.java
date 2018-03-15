package com.soft.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Address124")
public class Address {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
private int addressId;
	@ManyToMany(mappedBy="adresses")
	
	private Collection<Author> authors=new ArrayList<Author>();

	
	public Collection<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Collection<Author> authors) {
		this.authors = authors;
	}
	public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
	private String City;
	@Override
	public String toString() {
		return "Address [City=" + City + ", state=" + state + "]";
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String state;

}
