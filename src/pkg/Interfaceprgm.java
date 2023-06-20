package pkg;

interface tvremote
{
	public void click();
}
interface smarttvremote extends tvremote
{
	public void voicetyping();
}
class tv implements smarttvremote
{

	//@Override
	public void click() {
		
		System.out.println("button clicked");
		
	}

	//@Override
	public void voicetyping() {
		
		System.out.println("input voice");
		
	}
	
}

public class Interfaceprgm {

	public static void main(String[] args) {

		tv ob=new tv();
		ob.click();
		ob.voicetyping();
				
	}

}
