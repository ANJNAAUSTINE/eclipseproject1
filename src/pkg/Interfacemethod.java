package pkg;

interface Bank
{
	public void deposit();
	public void withdraw();
}
interface creditcard
{
	public void creditcarddetails();
	
}
class sbi implements Bank,creditcard
{
	public void deposit()
	{
		System.out.println("sbi deposit");
	}
	public void withdraw()
	{
		System.out.println("sbi withdraw");	
	}
	public void creditcarddetails()
	{
		System.out.println("sbi credit card");
	}

}
class Federal implements Bank
{
	public void deposit()
	{
		System.out.println("federal deposit");
	}
	public void withdraw()
	{
		System.out.println("fed withdraw");
	}
}
public class Interfacemethod {

	public static void main(String[] args) {

	   sbi ob=new sbi();
	   ob.deposit();
	   ob.withdraw();
	   ob.creditcarddetails();
	   Federal fed=new Federal();
	   fed.deposit();
	   fed.withdraw();
	   
		
	}

	
}
