package com.me.app.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AO_BULK_FILES database table.
 * 
 */
@Embeddable
public class AoBulkFilePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FILE_NAME")
	private String fileName;

	@Temporal(TemporalType.DATE)
	@Column(name="UPLOAD_DATE")
	private java.util.Date uploadDate;

	@Column(name="ID_FILE")
	private long idFile;

	public AoBulkFilePK() {
	}
	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public java.util.Date getUploadDate() {
		return this.uploadDate;
	}
	public void setUploadDate(java.util.Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public long getIdFile() {
		return this.idFile;
	}
	public void setIdFile(long idFile) {
		this.idFile = idFile;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AoBulkFilePK)) {
			return false;
		}
		AoBulkFilePK castOther = (AoBulkFilePK)other;
		return 
			this.fileName.equals(castOther.fileName)
			&& this.uploadDate.equals(castOther.uploadDate)
			&& (this.idFile == castOther.idFile);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fileName.hashCode();
		hash = hash * prime + this.uploadDate.hashCode();
		hash = hash * prime + ((int) (this.idFile ^ (this.idFile >>> 32)));
		
		return hash;
	}
}