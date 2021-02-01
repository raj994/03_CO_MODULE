package com.app.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "CO_PDFS")
public class CoPdfs {
	

	@Id
	@Column(name = "CO_PDF_ID")
	private Integer coPdfId;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "CASE_NUMBER")
	private String caseNumber;
	@Lob
	@Column(name = "PDF_DOCUMENT" ,length = 100000)
	private byte[] pdfDocument;
	@Column(name = "PLAN_NAME")
	private String planName;

}
