package com.me.app.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AO_ACCOUNT_INFO database table.
 * 
 */
@Entity
@Table(name="AO_ACCOUNT_INFO")
@NamedQuery(name="AoAccountInfo.findAll", query="SELECT a FROM AoAccountInfo a")
public class AoAccountInfo  {


	@EmbeddedId
	private AoAccountInfoPK id;

	@Column(name="AC_BRNO")
	private String acBrno;

	@Column(name="AC_INTRATE")
	private BigDecimal acIntrate;

	@Temporal(TemporalType.DATE)
	@Column(name="AC_OPENDATE")
	private Date acOpendate;

	@Column(name="AC_PASSBOOK_NO")
	private String acPassbookNo;

	@Column(name="AC_REST_FLAG")
	private String acRestFlag;

	@Column(name="AC_STATUS")
	private String acStatus;

	@Column(name="ACCOUNT_TYPE")
	private String accountType;

	@Column(name="ATM_NUMBER")
	private String atmNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="CLOSED_DATE")
	private Date closedDate;

	@Column(name="PRODUCT_TYPE")
	private String productType;
	
	public AoAccountInfo() {
	}

	public AoAccountInfoPK getId() {
		return this.id;
	}

	public void setId(AoAccountInfoPK id) {
		this.id = id;
	}

	public String getAcBrno() {
		return this.acBrno;
	}

	public void setAcBrno(String acBrno) {
		this.acBrno = acBrno;
	}

	public BigDecimal getAcIntrate() {
		return this.acIntrate;
	}

	public void setAcIntrate(BigDecimal acIntrate) {
		this.acIntrate = acIntrate;
	}

	public Date getAcOpendate() {
		return this.acOpendate;
	}

	public void setAcOpendate(Date acOpendate) {
		this.acOpendate = acOpendate;
	}

	public String getAcPassbookNo() {
		return this.acPassbookNo;
	}

	public void setAcPassbookNo(String acPassbookNo) {
		this.acPassbookNo = acPassbookNo;
	}

	public String getAcRestFlag() {
		return this.acRestFlag;
	}

	public void setAcRestFlag(String acRestFlag) {
		this.acRestFlag = acRestFlag;
	}

	public String getAcStatus() {
		return this.acStatus;
	}

	public void setAcStatus(String acStatus) {
		this.acStatus = acStatus;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAtmNumber() {
		return this.atmNumber;
	}

	public void setAtmNumber(String atmNumber) {
		this.atmNumber = atmNumber;
	}

	public Date getClosedDate() {
		return this.closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

}