package pkg;

import java.util.Scanner;

public class Reverse {

	public static void main(Stringoperations[] args) {
int s=0,r,temp;
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;

		}
		System.out.println(s);

		
		if(temp==s)
		{
			System.out.println("palindrome");

		}
		else
		{
			System.out.println("non palindrome");

		}
		
	}

}
