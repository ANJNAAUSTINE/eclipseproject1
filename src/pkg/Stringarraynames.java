package pkg;

import java.util.Scanner;

public class Stringarraynames {

	public static void main(Stringoperations[] args) {

		Stringoperations a[]=new Stringoperations[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the names");
        for(int i=0;i<5;i++)
        {
        	a[i]=sc.next();
        }
        System.out.println(" entered names are");
        for(Stringoperations v:a)
        {
        	System.out.println(v);
        }

	}

}
