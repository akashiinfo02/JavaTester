package com.akash.co;

public class Discountmember extends Gymember {
	 
	private double discount;
	
	Discountmember(  double disc , String name, double dura, double fee) {
		super (name, dura, fee );
		
	
	}
	
	private double getdiscount () {
		return discount;
		
	}
	
	private void setdiscount( double discount) {
		this.discount = discount;
		
	}
	
	
	public double getcost() {
		
		double cost = super.Totalcost();
		double netcost = cost - ( cost * discount/100) ;
		return netcost;
		
	}
	
	public String toString () {
		
		String  det = super.toString() + discount;
		return det;
		
		
	}

}
