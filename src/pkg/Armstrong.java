package pkg;

import java.util.Scanner;

public class Armstrong {

	public static void main(Stringoperations[] args) {

		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int r=0,s=0;
		int temp=n;
		while(n>0)
		{
		r=n%10;
		s=s+(r*r*r);
		n=n/10;
		}
		if(temp==s)
		{
			System.out.println("armstrong");
		}
		else
			System.out.println(" not armstrong");

	}

}
