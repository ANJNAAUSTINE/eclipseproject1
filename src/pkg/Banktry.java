package pkg;

import java.util.Scanner;


interface bank1
{ 
	
public void showdetails();
public void balance();
public void deposit();
public void withdraw();

}
class sbi1 implements bank

{
 int acc;
 String name;
 int blnc;
 int total;
 int deposit;
 int withdraw;
 int curblnc;
 int n;
 
 

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

public class Banktry {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer name");
		String name=sc.next();
		System.out.println("enter the acc no");
		int acc=sc.nextInt();
		sbi1 ob=new sbi1();

		System.out.println("enter your choice 1:details  2:deposit 3:balance 4:withdraw");
		int n=sc.nextInt();
		ob.n=n;
		
		switch(n)
		{
		case 1:
			
		ob.showdetails();
		ob.blnc=1200;
		ob.acc=acc;
		ob.name=name;
		break;
		case 2:
			
		System.out.println("enter the amount to be deposited");
        int deposit=sc.nextInt();
        ob.deposit=deposit;
		ob.deposit();
		break;
		
		case 3:
			
		ob.balance();
					
		break;
		
		case 4:
			
		System.out.println("enter the amount to be withdrawn");
		int withdraw=sc.nextInt();
		ob.withdraw=withdraw;
		ob.withdraw();
		
		default :System.out.println("wrong option");
		}
	
	}

}
