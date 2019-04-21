package com.me.app.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the AO_STATUS_FILE database table.
 * 
 */
@Entity
@Table(name = "AO_STATUS_FILE")
@NamedQuery(name = "AoStatusFile.findAll", query = "SELECT a FROM AoStatusFile a")
public class AoStatusFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String code;

	@Column(name = "STATUS_DESC")
	private String statusDesc;

	public AoStatusFile() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public AoBulkFile addAoBulkFile(AoBulkFile aoBulkFile) {

		aoBulkFile.setAoStatusFile(this);

		return aoBulkFile;
	}

	public AoBulkFile removeAoBulkFile(AoBulkFile aoBulkFile) {
		aoBulkFile.setAoStatusFile(null);

		return aoBulkFile;
	}

}