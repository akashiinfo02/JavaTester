package com.akash.co;

public class testermember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Gymember m1 = new Gymember ( " akashii" , 7.0 ,25500);
		System.out.println( m1);
	double t =	m1.Totalcost();
		System.out.println(t);
	//	m1.toString();
		
	Discountmember D1 = new Discountmember (5.5, "akashi", 6.0, 25000);
	D1.getcost();
	System.out.println(D1.getcost());
    D1.toString();
	 
	}

}
