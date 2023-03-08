package com.project.company.notice.domain;

import java.util.Date;

public class Notice {
	private int nbNo;
	private String nbTitle;
	private String nbContent;
	private String nbWriter;
	private Date nbDate;
	private int nbcYn;
	private int mNo;
	private int nReadCnt;
	
	public Notice() {}
	public Notice(int nbNo, String nbTitle, String nbContent, String nbWriter, Date nbDate, int nbcYn, int mNo, int nReadCnt) {
		this.nbNo = nbNo;
		this.nbTitle = nbTitle;
		this.nbContent = nbContent;
		this.nbWriter = nbWriter;
		this.nbDate = nbDate;
		this.nbcYn = nbcYn;
		this.mNo = mNo;
		this.nReadCnt = nReadCnt;
	}
	public int getNbNo() {
		return nbNo;
	}
	public void setNbNo(int nbNo) {
		this.nbNo = nbNo;
	}
	public String getNbTitle() {
		return nbTitle;
	}
	public void setNbTitle(String nbTitle) {
		this.nbTitle = nbTitle;
	}
	public String getNbContent() {
		return nbContent;
	}
	public void setNbContent(String nbContent) {
		this.nbContent = nbContent;
	}
	public String getNbWriter() {
		return nbWriter;
	}
	public void setNbWriter(String nbWriter) {
		this.nbWriter = nbWriter;
	}
	public Date getNbDate() {
		return nbDate;
	}
	public void setNbDate(Date nbDate) {
		this.nbDate = nbDate;
	}
	public int getNbcYn() {
		return nbcYn;
	}
	public void setNbcYn(int nbcYn) {
		this.nbcYn = nbcYn;
	}
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public int getnReadCnt() {
		return nReadCnt;
	}
	public void setnReadCnt(int nReadCnt) {
		this.nReadCnt = nReadCnt;
	}
}
