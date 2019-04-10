package com.me.app.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AO_CUSTOMER_INFO database table.
 * 
 */
@Entity
@Table(name="AO_CUSTOMER_INFO")
@NamedQuery(name="AoCustomerInfo.findAll", query="SELECT a FROM AoCustomerInfo a")
public class AoCustomerInfo  {
	@Id
	@Column(name="CIF_NO")
	private long cifNo;

	@Column(name="AMOUNT_INCOME")
	private BigDecimal amountIncome;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="CITIZEN_ID")
	private BigDecimal citizenId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	@Column(name="DOCUMENT_TYPE")
	private String documentType;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRE_DATE")
	private Date expireDate;

	@Column(name="FIRST_NAME_EN")
	private String firstNameEn;

	@Column(name="FIRST_NAME_TH")
	private String firstNameTh;

	@Column(name="HOME_EXT")
	private String homeExt;

	@Column(name="HOME_NUMBER")
	private String homeNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="ISSUE_DATE")
	private Date issueDate;

	@Column(name="LAST_NAME_EN")
	private String lastNameEn;

	@Column(name="LAST_NAME_TH")
	private String lastNameTh;

	@Column(name="MIDLE_NAME_EN")
	private String midleNameEn;

	@Column(name="MIDLE_NAME_TH")
	private String midleNameTh;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	private String nationality;

	private String occupation;

	@Column(name="OFF_EXT")
	private String offExt;

	@Column(name="OFF_NUMBER")
	private String offNumber;

	@Column(name="PREFIX_EN")
	private String prefixEn;

	@Column(name="PREFIX_TH")
	private String prefixTh;

	@Column(name="SOURCE_INCOME")
	private String sourceIncome;

	@Column(name="WK_ADDR_COUNTRY")
	private String wkAddrCountry;

	@Column(name="WK_ADDR_DISCTICT")
	private String wkAddrDisctict;

	@Column(name="WK_ADDR_MOO")
	private String wkAddrMoo;

	@Column(name="WK_ADDR_NO")
	private String wkAddrNo;

	@Column(name="WK_ADDR_POSTCODE")
	private BigDecimal wkAddrPostcode;

	@Column(name="WK_ADDR_PROVINCE")
	private String wkAddrProvince;

	@Column(name="WK_ADDR_ROAD")
	private String wkAddrRoad;

	@Column(name="WK_ADDR_SOI")
	private String wkAddrSoi;

	@Column(name="WK_ADDR_SUBDISCT")
	private String wkAddrSubdisct;

	@Column(name="WK_COMP_NAME")
	private String wkCompName;

	@Column(name="WK_POSITION")
	private String wkPosition;

	public AoCustomerInfo() {
	}

	public long getCifNo() {
		return this.cifNo;
	}

	public void setCifNo(long cifNo) {
		this.cifNo = cifNo;
	}

	public BigDecimal getAmountIncome() {
		return this.amountIncome;
	}

	public void setAmountIncome(BigDecimal amountIncome) {
		this.amountIncome = amountIncome;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public BigDecimal getCitizenId() {
		return this.citizenId;
	}

	public void setCitizenId(BigDecimal citizenId) {
		this.citizenId = citizenId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getFirstNameEn() {
		return this.firstNameEn;
	}

	public void setFirstNameEn(String firstNameEn) {
		this.firstNameEn = firstNameEn;
	}

	public String getFirstNameTh() {
		return this.firstNameTh;
	}

	public void setFirstNameTh(String firstNameTh) {
		this.firstNameTh = firstNameTh;
	}

	public String getHomeExt() {
		return this.homeExt;
	}

	public void setHomeExt(String homeExt) {
		this.homeExt = homeExt;
	}

	public String getHomeNumber() {
		return this.homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getLastNameEn() {
		return this.lastNameEn;
	}

	public void setLastNameEn(String lastNameEn) {
		this.lastNameEn = lastNameEn;
	}

	public String getLastNameTh() {
		return this.lastNameTh;
	}

	public void setLastNameTh(String lastNameTh) {
		this.lastNameTh = lastNameTh;
	}

	public String getMidleNameEn() {
		return this.midleNameEn;
	}

	public void setMidleNameEn(String midleNameEn) {
		this.midleNameEn = midleNameEn;
	}

	public String getMidleNameTh() {
		return this.midleNameTh;
	}

	public void setMidleNameTh(String midleNameTh) {
		this.midleNameTh = midleNameTh;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOffExt() {
		return this.offExt;
	}

	public void setOffExt(String offExt) {
		this.offExt = offExt;
	}

	public String getOffNumber() {
		return this.offNumber;
	}

	public void setOffNumber(String offNumber) {
		this.offNumber = offNumber;
	}

	public String getPrefixEn() {
		return this.prefixEn;
	}

	public void setPrefixEn(String prefixEn) {
		this.prefixEn = prefixEn;
	}

	public String getPrefixTh() {
		return this.prefixTh;
	}

	public void setPrefixTh(String prefixTh) {
		this.prefixTh = prefixTh;
	}

	public String getSourceIncome() {
		return this.sourceIncome;
	}

	public void setSourceIncome(String sourceIncome) {
		this.sourceIncome = sourceIncome;
	}

	public String getWkAddrCountry() {
		return this.wkAddrCountry;
	}

	public void setWkAddrCountry(String wkAddrCountry) {
		this.wkAddrCountry = wkAddrCountry;
	}

	public String getWkAddrDisctict() {
		return this.wkAddrDisctict;
	}

	public void setWkAddrDisctict(String wkAddrDisctict) {
		this.wkAddrDisctict = wkAddrDisctict;
	}

	public String getWkAddrMoo() {
		return this.wkAddrMoo;
	}

	public void setWkAddrMoo(String wkAddrMoo) {
		this.wkAddrMoo = wkAddrMoo;
	}

	public String getWkAddrNo() {
		return this.wkAddrNo;
	}

	public void setWkAddrNo(String wkAddrNo) {
		this.wkAddrNo = wkAddrNo;
	}

	public BigDecimal getWkAddrPostcode() {
		return this.wkAddrPostcode;
	}

	public void setWkAddrPostcode(BigDecimal wkAddrPostcode) {
		this.wkAddrPostcode = wkAddrPostcode;
	}

	public String getWkAddrProvince() {
		return this.wkAddrProvince;
	}

	public void setWkAddrProvince(String wkAddrProvince) {
		this.wkAddrProvince = wkAddrProvince;
	}

	public String getWkAddrRoad() {
		return this.wkAddrRoad;
	}

	public void setWkAddrRoad(String wkAddrRoad) {
		this.wkAddrRoad = wkAddrRoad;
	}

	public String getWkAddrSoi() {
		return this.wkAddrSoi;
	}

	public void setWkAddrSoi(String wkAddrSoi) {
		this.wkAddrSoi = wkAddrSoi;
	}

	public String getWkAddrSubdisct() {
		return this.wkAddrSubdisct;
	}

	public void setWkAddrSubdisct(String wkAddrSubdisct) {
		this.wkAddrSubdisct = wkAddrSubdisct;
	}

	public String getWkCompName() {
		return this.wkCompName;
	}

	public void setWkCompName(String wkCompName) {
		this.wkCompName = wkCompName;
	}

	public String getWkPosition() {
		return this.wkPosition;
	}

	public void setWkPosition(String wkPosition) {
		this.wkPosition = wkPosition;
	}

}