package pkg;

import java.util.Scanner;

public class Calcusingscanner {

	public static void main(Stringoperations[] args) {

		System.out.println("enter the 1st number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
		System.out.println("enter the 2nd number");
		int b=sc.nextInt();
		System.out.println("select the operation 1.ADD  2.SUB  3.DIV  4.MUL");
		int c=sc.nextInt();
	double result=0;
		switch(c)
		{
		case 1: result=a+b;
		break;
		case 2: result=a-b;
		break;
		case 3: if(b!=0) {
			result=a/b;
		}
		else 
			System.out.println("not divisible by 0");
		
		break;
		case 4: result=a*b;
		break;
		default:System.out.println("invalid option");
		}
		System.out.println("result="+result);
	}

}
