package pkg;

import java.util.Scanner;

public class Vowelsinstring {

	public static void main(String[] args) {
        
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i')
			{
				count++;
			}

		}
		System.out.println(count);
	}

}
