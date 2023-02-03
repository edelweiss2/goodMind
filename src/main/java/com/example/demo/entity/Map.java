package com.example.demo.entity;

public class Map {
	private String orgName;
	private String orgType;
	private String addr;
	private String homepage;
	
	public Map() {}	
	public Map(String orgName, String orgType, String addr) {
		super();
		this.orgName = orgName;
		this.orgType = orgType;
		this.addr = addr;
	}
	public Map(String orgName, String orgType, String addr, String homepage) {
		super();
		this.orgName = orgName;
		this.orgType = orgType;
		this.addr = addr;
		this.homepage = homepage;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	@Override
	public String toString() {
		return "orgName=" + orgName + ", orgType=" + orgType + ", addr=" + addr + ", homepage=" + homepage;
	}
}
