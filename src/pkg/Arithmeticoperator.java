package pkg;

public class Arithmeticoperator {

	public static void main(Stringoperations[] args) {
//arithmetic operator
		int a=20,b=30,g=1,h=0;

		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
//assignment operator
  
		int c=30,d=20;
		System.out.println("c=c+d is"+(c+=d));//30 +20=50
		System.out.println("c=c-d is"+(c-=d));//50-20=30 , the value of c changed 
		
//relational operator
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
// logical operator
		
		Stringoperations uname="abc";
		Stringoperations pwd="123";
		System.out.println(uname=="abc"&& pwd=="123");
		System.out.println(uname=="abc"|| pwd=="123");
		System.out.println(!(uname=="abc"));
		
//unary operator
		
		int d1=4;
		System.out.println(d1++);
		System.out.println(d1);

		

		
		

		


	}

}
