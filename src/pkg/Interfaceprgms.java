package pkg;


class Monkey
{
	public void jump ()
	{
		System.out.println(" monkey jumped");
		
	}
	public void bite()
	{
		System.out.println("monkey bitted");

	}
}

interface basicanimal
{
	public void eat();
	public void sleep();
}

class human extends Monkey implements basicanimal
{
	public void speak()
	{
		System.out.println("human speaked");

	}
	public void eat()
	{
		System.out.println("animal eat");
	}
	public void sleep()
	{
		System.out.println("animal sleeped");

	}
}


public class Interfaceprgms {

	public static void main(String[] args) {
		
		human ob=new human();
		ob.speak();
		ob.sleep();
		ob.eat();
		ob.jump();
		ob.bite();

	}

}
