package pkg;

import java.util.Scanner;

public class Sumnaveragearray {

	public static void main(Stringoperations[] args) {

		int a[]=new int[4];
		int sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		//or
		//for(int v:a)
		//{
		//	sum=sum+v;
		//}
		avg=sum/4;
		System.out.println("sum="+sum);
		System.out.println("average="+avg);
	}

}
