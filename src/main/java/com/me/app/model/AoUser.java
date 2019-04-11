package com.me.app.model;

import javax.persistence.*;


/**
 * The persistent class for the AO_USERS database table.
 * 
 */
@Entity
@Table(name="AO_USERS")
@NamedQuery(name="AoUser.findAll", query="SELECT a FROM AoUser a")
public class AoUser  {

	@Id
	@Column(name="USER_ID")
	private long userId;

	@Column(name="BRN_USER")
	private String brnUser;

	private String firstname;

	private String lastname;

	private String username;
	
	@Column(name="PASSWORD")
	private String password;

	//bi-directional many-to-one association to AoUsersRole
	@OneToOne
	@JoinColumn(name="ROLE_ID")
	private AoUsersRole aoUsersRole;

	public AoUser() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getBrnUser() {
		return this.brnUser;
	}

	public void setBrnUser(String brnUser) {
		this.brnUser = brnUser;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public AoUsersRole getAoUsersRole() {
		return this.aoUsersRole;
	}

	public void setAoUsersRole(AoUsersRole aoUsersRole) {
		this.aoUsersRole = aoUsersRole;
	}

}