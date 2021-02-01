package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BATCh_SUMMARY")
public class BatchSummary {
	
	@Id
	@Column(name = "SUMMARY_ID")
	private Integer summaryId;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "FAILURE_TR_COUNT")
	private Integer failureTriggerCount;
	@Column(name = "SUCESS_TR_COUNT")
	private Integer sucessTriggerCount;
	@Column(name = "TOTAL_TR_PR")
	private Integer totalTriggerProcessed;

}
