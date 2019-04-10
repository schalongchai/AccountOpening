package com.me.app.model;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the AO_USERS_ROLES database table.
 * 
 */
@Entity
@Table(name="AO_USERS_ROLES")
@NamedQuery(name="AoUsersRole.findAll", query="SELECT a FROM AoUsersRole a")
public class AoUsersRole  {


	@Id
	@Column(name="ROLE_ID")
	private String roleId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="ROLE_DESC")
	private String roleDesc;

	public AoUsersRole() {
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}




}