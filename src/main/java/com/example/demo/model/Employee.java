package com.example.demo.model;

import com.example.demo.exceptions.CustomDemoException;

public class Employee {

	public Employee(String eid, String ename) {
	this.eid=eid;
	this.ename=ename;
	}

	private String eid;
	private String ename;
	
	public Long getEid() throws CustomDemoException{
		return Long.parseLong(eid);
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
