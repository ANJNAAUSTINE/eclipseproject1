package pkg;


class Animal
{
	public void breed()
	{
		System.out.println("lab");
	}
}
class Dog extends Animal
{
	public void food()
	{
		System.out.println("food");

	}
}
class Babydog extends Dog
{
	public void feature()
	{
		System.out.println("babydog");

	}
}

// hirarichal inheritance

class Pet extends Animal           
{
	public void gromming() 
	{
		System.out.println("gromming");

	}
}
public class Inheritanceprop {

	public static void main(String[] args) {

		Dog ob=new Dog();
		ob.breed();
		ob.food();
		
		Babydog bd=new Babydog();
		bd.breed();
		bd.food();
		bd.feature();
		
		//hirarichal inheritance
		
	    Pet pt =new Pet();
	    pt.breed();
	    pt.gromming();
		
		
		
	}

}
