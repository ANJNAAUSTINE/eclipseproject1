package pkg;

import java.util.Scanner;

public class Stringpresentornot {

	public static void main(String[] args) {

		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	
		if(str.contains("language"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
			}
	}

}
