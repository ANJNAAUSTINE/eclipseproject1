package pkg;

import java.util.Scanner;

public class Twodimenarray {

	public static void main(Stringoperations[] args) {
		int a[][]=new int[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		//	for(int i=0;i<3;i++)
			//{
				//for(int j=0;j<2;j++)
				//{
					//System.out.print(a[i][j]);
				//}
				//System.out.println();
			//}
		
		//or
		for(int v[]:a)
		{
			for(int v1:v)
			{
				System.out.print(v1);
			}
			System.out.println();

		}

	}

}
