package pkg;

import java.util.Scanner;

interface bank
{
public void showdetails();
public void balance();
public void deposit();
public void withdraw();

}
class sbi implements bank
{
 int acc;
 String name;
 int blnc;
 int total;
 int deposit;
 int withdraw;
 int curblnc;
 
	public void showdetails() {
		
		
		System.out.println("acc no="+acc);
		System.out.println("customer name="+name);
		System.out.println("Acc type= savings");
		System.out.println("IFSC= SBI00068");

        
	}

	
	public void balance() {
		
		System.out.println("balance="+blnc);

		
	}

	public void deposit() {
		
		total=blnc+deposit;
		System.out.println("total balance="+total);
		
	}

	public void withdraw() {
		
		curblnc=total-withdraw;
		System.out.println("current balance after withdrawal="+curblnc);
		
	}
	
}
public class Bankinterface {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer name");
		String name=sc.next();
		System.out.println("enter the acc no");
		int acc=sc.nextInt();
		sbi ob=new sbi();
		
		ob.blnc=1200;
		ob.acc=acc;
		ob.name=name;
		ob.showdetails();
		
		ob.balance();
		
		System.out.println("enter the amount to be deposited");
		int deposit=sc.nextInt();
		ob.deposit=deposit;
		ob.deposit();
		
		System.out.println("enter the amount to be withdrawn");
		int withdraw=sc.nextInt();
		ob.withdraw=withdraw;
		ob.withdraw();
	}

}
