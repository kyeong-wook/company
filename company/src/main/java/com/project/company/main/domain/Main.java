package com.project.company.main.domain;

public class Main {
	private int mNo;
	private String mId;
	private String mPass;
	private String mName;
	private String mbirth;
	private String mGen;
	private String mEmail;
	private int mTel;
	private String mAddr1;
	private String mAddr2;
	
	public Main() {}
	public Main(int mNo, String mId, String mPass, String mName, String mbirth, String mGen, String mEmail, int mTel, String mAddr1, String mAddr2) {
		this.mNo = mNo;
		this.mId = mId;
		this.mPass = mPass;
		this.mName = mName;
		this.mbirth = mbirth;
		this.mGen = mGen;
		this.mEmail = mEmail;
		this.mTel = mTel;
		this.mAddr1 = mAddr1;
		this.mAddr2 = mAddr2;
	}
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPass() {
		return mPass;
	}
	public void setmPass(String mPass) {
		this.mPass = mPass;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getMbirth() {
		return mbirth;
	}
	public void setMbirth(String mbirth) {
		this.mbirth = mbirth;
	}
	public String getmGen() {
		return mGen;
	}
	public void setmGen(String mGen) {
		this.mGen = mGen;
	}
	public String getmEmail() {
		return mEmail;
	}
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	public int getmTel() {
		return mTel;
	}
	public void setmTel(int mTel) {
		this.mTel = mTel;
	}
	public String getmAddr1() {
		return mAddr1;
	}
	public void setmAddr1(String mAddr1) {
		this.mAddr1 = mAddr1;
	}
	public String getmAddr2() {
		return mAddr2;
	}
	public void setmAddr2(String mAddr2) {
		this.mAddr2 = mAddr2;
	}
	
	
}
