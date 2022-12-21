package com.akash.co;

public class Gymember {
	
	private String membername;
	private double duration;
	private double monthfee;
	
	Gymember ( String name, double dura, double fee) {
		
		this.membername = name;
		this.duration = dura;
		this.monthfee = fee;
		
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getMonthfee() {
		return monthfee;
	}

	public void setMonthfee(int monthfee) {
		this.monthfee = monthfee;
	}
	
	
	public  double Totalcost () {
		
		return monthfee * duration;
		
	}
	

	public String toString  () {
		String det = membername  + "," + duration + ", " + monthfee;
		return det;
	}
}
