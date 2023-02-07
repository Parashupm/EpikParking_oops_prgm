package com.oops.prgms;

public class Vechicle {


	private String vechicleno;
	private String vechicle_type;
	private String vechicle_model;
	private long phno;
	private String customer_name;
	private String checkintime;
	private String checkOutTime;
	
	public String getVechicleno() {
		return vechicleno;
	}
	public void setVechicleno(String vechicleno) {
		this.vechicleno = vechicleno;
	}
	public String getVechicle_type() {
		return vechicle_type;
	}
	public void setVechicle_type(String vechicle_type) {
		this.vechicle_type = vechicle_type;
	}
	public String getVechicle_model() {
		return vechicle_model;
	}
	public void setVechicle_model(String vechicle_model) {
		this.vechicle_model = vechicle_model;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(String checkintime) {
		this.checkintime = checkintime;
	}
	public String getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	@Override
	public String toString() {
		return "Vechicle [vechicleno=" + vechicleno + ", vechicle_type=" + vechicle_type + ", vechicle_model="
				+ vechicle_model + ", phno=" + phno + ", customer_name=" + customer_name + ", checkintime="
				+ checkintime + ", checkOutTime=" + checkOutTime + "]";
	}
	
	
}
