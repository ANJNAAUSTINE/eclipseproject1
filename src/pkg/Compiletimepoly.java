package pkg;


public class Compiletimepoly {

	public static void main(String[] args) {
    
		Compiletimepoly cmp=new Compiletimepoly();
		cmp.add();
		cmp.add(10, 20);
		cmp.add(3.2,12);
		cmp.add(29, 2.4);
	}
	public void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);

	}
	public void add(int a,double b)
	{
		double c;
		c=a+b;
		System.out.println(c);

	}
	public void add(double a,int b)
	{
		double c;
		c=a+b;
		System.out.println(c);

	}

}
