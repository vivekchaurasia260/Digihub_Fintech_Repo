package com.org.digihub.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "digi_config_documents")
public class DigiConfigDocumentsVO {
	@Id
	@Column(name = "doc_id")
	String docId;
	@Column(name = "filter_1")
	String filter1;
	@Column(name = "filter_2")
	String filter2;
	@Column(name = "filter_3")
	String filter3;
	@Column(name = "seq")
	int seq;
	@Column(name = "doc_name")
	String docName;
	@Column(name = "doc_desc")
	String docDesc;
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getFilter1() {
		return filter1;
	}
	public void setFilter1(String filter1) {
		this.filter1 = filter1;
	}
	public String getFilter2() {
		return filter2;
	}
	public void setFilter2(String filter2) {
		this.filter2 = filter2;
	}
	public String getFilter3() {
		return filter3;
	}
	public void setFilter3(String filter3) {
		this.filter3 = filter3;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocDesc() {
		return docDesc;
	}
	public void setDocDesc(String docDesc) {
		this.docDesc = docDesc;
	}
	
	

}
