package pkg;

public class Forloop {

	public static void main(Stringoperations[] args) {

		for(int i=1;i<=6;i++)
		{
			System.out.println("ANJNA");
		}
			
	/*pattern ****
		      ****
		      ****
*/		      
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//*
//**
//***	
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
			

		
		
	}

}