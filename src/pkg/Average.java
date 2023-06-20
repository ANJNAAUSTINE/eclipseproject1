package pkg;

import java.util.Scanner;

public class Average {

	public static void main(Stringoperations[] args) {
		double sum1=0,sum2=0;
System.out.println("enter the value");
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{   if(i%2==0)
		{
			sum1=sum1+i;
		}
		else
		{sum2=sum2+i;
		}
		}
		System.out.println("even sum="+sum1);
		System.out.println("odd sum="+sum2);

		
	}

}
