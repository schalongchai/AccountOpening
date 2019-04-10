package com.me.app.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AO_BULK_DETAIL database table.
 * 
 */
@Entity
@Table(name="AO_BULK_DETAIL")
@NamedQuery(name="AoBulkDetail.findAll", query="SELECT a FROM AoBulkDetail a")
public class AoBulkDetail  {

	@EmbeddedId
	private AoBulkDetailPK id;

	@Column(name="AC_BRANCH")
	private String acBranch;

	@Column(name="AC_NO")
	private BigDecimal acNo;

	@Column(name="AC_OPEN_TYPE")
	private String acOpenType;

	@Temporal(TemporalType.DATE)
	@Column(name="AC_OPENDATE")
	private Date acOpendate;

	@Column(name="AC_PRODUCT_TYPE")
	private String acProductType;

	@Column(name="AC_STATUS")
	private String acStatus;

	@Column(name="AMOUNT_INCOME")
	private BigDecimal amountIncome;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="CIF_NO")
	private BigDecimal cifNo;

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

	@Column(name="INV_VAL_FIELD")
	private String invValField;

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

	@Column(name="MISSING_FIELD")
	private String missingField;

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

	@Column(name="REQ_FIELD_PASSED")
	private String reqFieldPassed;

	@Column(name="SOURCE_INCOME")
	private String sourceIncome;

	@Column(name="VAL_FIELD_PASSED")
	private String valFieldPassed;

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

	public AoBulkDetail() {
	}

	public AoBulkDetailPK getId() {
		return this.id;
	}

	public void setId(AoBulkDetailPK id) {
		this.id = id;
	}

	public String getAcBranch() {
		return this.acBranch;
	}

	public void setAcBranch(String acBranch) {
		this.acBranch = acBranch;
	}

	public BigDecimal getAcNo() {
		return this.acNo;
	}

	public void setAcNo(BigDecimal acNo) {
		this.acNo = acNo;
	}

	public String getAcOpenType() {
		return this.acOpenType;
	}

	public void setAcOpenType(String acOpenType) {
		this.acOpenType = acOpenType;
	}

	public Date getAcOpendate() {
		return this.acOpendate;
	}

	public void setAcOpendate(Date acOpendate) {
		this.acOpendate = acOpendate;
	}

	public String getAcProductType() {
		return this.acProductType;
	}

	public void setAcProductType(String acProductType) {
		this.acProductType = acProductType;
	}

	public String getAcStatus() {
		return this.acStatus;
	}

	public void setAcStatus(String acStatus) {
		this.acStatus = acStatus;
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

	public BigDecimal getCifNo() {
		return this.cifNo;
	}

	public void setCifNo(BigDecimal cifNo) {
		this.cifNo = cifNo;
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

	public String getInvValField() {
		return this.invValField;
	}

	public void setInvValField(String invValField) {
		this.invValField = invValField;
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

	public String getMissingField() {
		return this.missingField;
	}

	public void setMissingField(String missingField) {
		this.missingField = missingField;
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

	public String getReqFieldPassed() {
		return this.reqFieldPassed;
	}

	public void setReqFieldPassed(String reqFieldPassed) {
		this.reqFieldPassed = reqFieldPassed;
	}

	public String getSourceIncome() {
		return this.sourceIncome;
	}

	public void setSourceIncome(String sourceIncome) {
		this.sourceIncome = sourceIncome;
	}

	public String getValFieldPassed() {
		return this.valFieldPassed;
	}

	public void setValFieldPassed(String valFieldPassed) {
		this.valFieldPassed = valFieldPassed;
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