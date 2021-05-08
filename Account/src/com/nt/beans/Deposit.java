package com.nt.beans;

public class Deposit {
int amount;
public Deposit() {
	System.out.println("Deposit.Deposit()");
}
public void Deposit(int amount) throws Exception{
//inital amount is 20000rs	
if(amount<20000) {
System.out.println("Amount Deposited:"+amount);		
System.out.println("Total Amount:"+(20000+(amount)));	
System.out.println("Amount Deposited");
}else 
	System.out.println("invalid deposit");

		
	}
}

