package pkg;

abstract class car
{
	abstract public void speedlimit();
}
class Maruti extends car
{

	public void speedlimit()
	{
	  System.out.println("car speedlimit");	
	}
	
}
public class Abstractmethod {
	
	public static void main(String[] args) {
		
		Maruti ob=new Maruti();
		ob.speedlimit();

	}

}
