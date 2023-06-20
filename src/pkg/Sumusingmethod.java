package pkg;

import java.util.Scanner;

public class Sumusingmethod {

	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n[]=new int[4];
		//int n[i]=sc.nextInt();
        Sumusingmethod s=new Sumusingmethod();
       System.out.println("sum="+s.sum(n));
	}
	 public int sum(int n[])
	  { int sum1=0;
	  for(int i=1;i<=4;i++)
	  { 
		 n[i]=sc.next();
		 sum1=sum1+n[i];
	 }
	  int avg=sum1/4;
	//  return avg;
	  }

}
