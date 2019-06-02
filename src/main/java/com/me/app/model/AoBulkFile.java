package com.me.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AO_BULK_FILES database table.
 * 
 */
@Entity
@Table(name="AO_BULK_FILES")
@NamedQuery(name="AoBulkFile.findAll", query="SELECT a FROM AoBulkFile a")
public class AoBulkFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_FILE")
	private Long id;

	
	@Column(name="FILE_NAME")
	private String fileName;
	
	
	@Column(name="APPROVED_BY")
	private String approvedBy;
	
	
	public final String getFileName() {
		return fileName;
	}

	public final void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="PROCESS_DATE")
	private Date processDate;

	@Column(name="TOTAL_COMPLETED")
	private BigDecimal totalCompleted;

	@Column(name="TOTAL_FAILED")
	private BigDecimal totalFailed;

	@Column(name="TOTAL_PASSED")
	private BigDecimal totalPassed;

	@Column(name="TOTAL_REC")
	private BigDecimal totalRec;

	@Column(name="TOTAL_REJECTED")
	private BigDecimal totalRejected;

	@Column(name="UPLOAD_BY")
	private String uploadBy;

	@OneToOne
	@JoinColumn(name="CODE")
	private AoStatusFile aoStatusFile;
	

	public AoBulkFile() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getProcessDate() {
		return this.processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public BigDecimal getTotalCompleted() {
		return this.totalCompleted;
	}

	public void setTotalCompleted(BigDecimal totalCompleted) {
		this.totalCompleted = totalCompleted;
	}

	public BigDecimal getTotalFailed() {
		return this.totalFailed;
	}

	public void setTotalFailed(BigDecimal totalFailed) {
		this.totalFailed = totalFailed;
	}

	public BigDecimal getTotalPassed() {
		return this.totalPassed;
	}

	public void setTotalPassed(BigDecimal totalPassed) {
		this.totalPassed = totalPassed;
	}

	public BigDecimal getTotalRec() {
		return this.totalRec;
	}

	public void setTotalRec(BigDecimal totalRec) {
		this.totalRec = totalRec;
	}

	public BigDecimal getTotalRejected() {
		return this.totalRejected;
	}

	public void setTotalRejected(BigDecimal totalRejected) {
		this.totalRejected = totalRejected;
	}

	public String getUploadBy() {
		return this.uploadBy;
	}

	public void setUploadBy(String uploadBy) {
		this.uploadBy = uploadBy;
	}

	public AoStatusFile getAoStatusFile() {
		return this.aoStatusFile;
	}

	public void setAoStatusFile(AoStatusFile aoStatusFile) {
		this.aoStatusFile = aoStatusFile;
	}

}