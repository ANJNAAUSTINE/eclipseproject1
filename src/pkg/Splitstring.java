package pkg;

public class Splitstring {

	public static void main(String[] args) {

		String s=new String("selenium is webapplication is testing");
		String str[]=s.split(" ");
		for(String v:str)
		{
			System.out.println(v);

			if(v.contains("webapplication"))
			{
		      break;
			}
		}

	}

}
