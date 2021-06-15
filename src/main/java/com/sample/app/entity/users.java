package com.sample.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.relational.core.mapping.Column;

@Entity
@Table(name="users")
public class users {
	@Column("id")
	@Id
	private int id;
	@Column("username")
	private String username;
	@Column("password")
	private String password;
	@Column("enabled")
	private int enabled;
	public users(int id, String username, String password, int enabled) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
	
	
	

}
