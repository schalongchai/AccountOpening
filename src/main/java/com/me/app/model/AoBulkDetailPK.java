package com.me.app.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the AO_BULK_DETAIL database table.
 * 
 */
@Embeddable
public class AoBulkDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_FILE")
	private long idFile;

	@Column(name="CITIZEN_ID")
	private long citizenId;

	public AoBulkDetailPK() {
	}
	public long getIdFile() {
		return this.idFile;
	}
	public void setIdFile(long idFile) {
		this.idFile = idFile;
	}
	public long getCitizenId() {
		return this.citizenId;
	}
	public void setCitizenId(long citizenId) {
		this.citizenId = citizenId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AoBulkDetailPK)) {
			return false;
		}
		AoBulkDetailPK castOther = (AoBulkDetailPK)other;
		return 
			(this.idFile == castOther.idFile)
			&& (this.citizenId == castOther.citizenId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idFile ^ (this.idFile >>> 32)));
		hash = hash * prime + ((int) (this.citizenId ^ (this.citizenId >>> 32)));
		
		return hash;
	}
}