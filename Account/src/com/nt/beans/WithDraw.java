package com.nt.beans;

public class WithDraw extends Exception{
private	 int amount;
	int amount1;
private	String msg;

	
	public void WithDraw(int amount) throws Exception {
		//intial amount 20000rs
		if(amount<20000) {
			System.out.println(amount);
			System.out.println("bal Amount:"+(20000-(amount)));
			System.out.println(amount);
			System.out.println("Transaction Completed...");
			}else{

			System.out.println("Invalid Amount pls Enter below 2000 amt..");
}
	}
}