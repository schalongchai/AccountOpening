package com.me.app.model;

import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AO_STATUS_FILE database table.
 * 
 */
@Entity
@Table(name="AO_STATUS_FILE")
@NamedQuery(name="AoStatusFile.findAll", query="SELECT a FROM AoStatusFile a")
public class AoStatusFile  {
	@Id
	private String code;

	@Column(name="STATUS_DESC")
	private String statusDesc;

	//bi-directional many-to-one association to AoBulkFile
	@OneToMany(mappedBy="aoStatusFile")
	private List<AoBulkFile> aoBulkFiles;

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

	public List<AoBulkFile> getAoBulkFiles() {
		return this.aoBulkFiles;
	}

	public void setAoBulkFiles(List<AoBulkFile> aoBulkFiles) {
		this.aoBulkFiles = aoBulkFiles;
	}

	public AoBulkFile addAoBulkFile(AoBulkFile aoBulkFile) {
		getAoBulkFiles().add(aoBulkFile);
		aoBulkFile.setAoStatusFile(this);

		return aoBulkFile;
	}

	public AoBulkFile removeAoBulkFile(AoBulkFile aoBulkFile) {
		getAoBulkFiles().remove(aoBulkFile);
		aoBulkFile.setAoStatusFile(null);

		return aoBulkFile;
	}

}