package pkg;

public class Exceptionhndl {

	public static void main(String[] args) {

		try
		{
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("arithmetic exception");


		}
		
		try
		{
			int a[]=new int[2];
			a[0]=12;
			a[1]=23;
			System.out.println(a[3]);

		}
		catch(Exception e)
		{
			System.out.println("arrayindexoutofbound");

			System.out.println(e.getMessage());

		}
		
		try
		{
			String s=null;
			System.out.println(s.length());

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());

		}
	}

}
