package com.mightyjava.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class User extends AbstractPersistable<Long> {
	private static final long serialVersionUID = -7302800336276816169L;
	private String userId;
	private String userName;
	private String password;

	@OneToMany(targetEntity = Address.class, mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Address> addresses;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
