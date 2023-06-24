package com.springcore;

public class Student {
	private String sName;
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sId=" + sId + "]";
	}
	public Student(String sName, String sId) {
		super();
		this.sName = sName;
		this.sId = sId;
	}
	public Student() {
		super();
		
	}
	private String sId;
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

}
