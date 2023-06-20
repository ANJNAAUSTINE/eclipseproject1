package pkg;

public class Dowhilereverse {

	public static void main(Stringoperations[] args) {

		int n=123,c=0;
		while(n>0)
		{
			c=n%10;   //  123%10=3		12%10=2	   1%10=1
			n=n/10;   //  123/10=12     12/10=1    1/10=0
			System.out.print(c);
		}
	}

}
