package com.nt.beans;
import java.util.Scanner;
public class Bank {
public static void main(String[] args) throws Exception {
	try(Scanner sc= new Scanner(System.in)){
		System.out.println("Choice");
		System.out.println("Enter the choice");
	xyz:	
	while(true) {
		System.out.println(" 1:WithDraw \n 2:Deposit \n ");
		Integer choice=Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1:
			System.out.println("Enter the amount to withdraw");
			int amount=Integer.parseInt(sc.nextLine());
			if(amount>0 && amount%100==0) {
			WithDraw wd= new WithDraw() ;
			wd.WithDraw(amount);
			}else {
				System.out.println("Invalid Amount Entered");
			}
			break xyz;
			
		case 2:
			System.out.println("Enter the amount to Deposit");
			int amount2=Integer.parseInt(sc.nextLine());
		Deposit dp= new Deposit();
		dp.Deposit(amount2);
		break xyz;

			default:
				throw new IllegalArgumentException("Invalid choice") ;
		}
		}//end while
	}catch(NumberFormatException | ArithmeticException ae )
	{
		ae.printStackTrace();
	}
}


}
