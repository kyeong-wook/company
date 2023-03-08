package com.project.company.qna.domain;

import java.util.Date;

public class Qna {
	private int qnabNo;
	private String qnabTitle;
	private String qnabContent;
	private String qnabWriter;
	private Date qnabDate;
	private int qnabcYn;
	private int mNo;
	private int mnReadCnt;
	public Qna() {}
	public Qna(int qnabNo, String qnabTitle, String qnabContent, String qnabWriter,Date qnabDate, int qnabcYn, int mNo, int mnReadCnt) {
		this.qnabNo = qnabNo;
		this.qnabTitle = qnabTitle;
		this.qnabContent = qnabContent;
		this.qnabWriter = qnabWriter;
		this.qnabDate = qnabDate;
		this.qnabcYn = qnabcYn;
		this.mNo=  mNo;
		this.mnReadCnt = mnReadCnt;
	}
	public int getQnabNo() {
		return qnabNo;
	}
	public void setQnabNo(int qnabNo) {
		this.qnabNo = qnabNo;
	}
	public String getQnabTitle() {
		return qnabTitle;
	}
	public void setQnabTitle(String qnabTitle) {
		this.qnabTitle = qnabTitle;
	}
	public String getQnabContent() {
		return qnabContent;
	}
	public void setQnabContent(String qnabContent) {
		this.qnabContent = qnabContent;
	}
	public String getQnabWriter() {
		return qnabWriter;
	}
	public void setQnabWriter(String qnabWriter) {
		this.qnabWriter = qnabWriter;
	}
	public Date getQnabDate() {
		return qnabDate;
	}
	public void setQnabDate(Date qnabDate) {
		this.qnabDate = qnabDate;
	}
	public int getQnabcYn() {
		return qnabcYn;
	}
	public void setQnabcYn(int qnabcYn) {
		this.qnabcYn = qnabcYn;
	}
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public int getMnReadCnt() {
		return mnReadCnt;
	}
	public void setMnReadCnt(int mnReadCnt) {
		this.mnReadCnt = mnReadCnt;
	}
}
