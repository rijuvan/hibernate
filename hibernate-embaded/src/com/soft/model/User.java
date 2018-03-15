package com.soft.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user41")
public class User {
	@EmbeddedId
	private UserId username;
	
	private String role;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [" + (username != null ? "username=" + username + ", " : "") + (role != null ? "role=" + role : "")
				+ "]";
	}
	/**
	 * @return the username
	 */
	public UserId getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(UserId username) {
		this.username = username;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(UserId username, String role) {
		super();
		this.username = username;
		this.role = role;
	}
	

}
