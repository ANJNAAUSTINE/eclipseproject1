package pkg;


class Car
{
	public void accelator()
	{
		System.out.println("accelator");
	}
}
class Bmw extends Car
{

	@Override
	public void accelator() {
	
		System.out.println(" BMW accelator");
        super.accelator();
	}
	
}



public class Overridingmethod {

	public static void main(String[] args) {

		 Bmw ov=new Bmw();
		ov.accelator();
	}

}
