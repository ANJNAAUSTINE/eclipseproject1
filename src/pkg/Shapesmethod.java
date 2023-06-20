package pkg;

public class Shapesmethod {

	public static void main(String[] args) {
		Shapesmethod sh=new Shapesmethod();
	    sh.triangle();
        System.out.println("are of rectangle="+sh.rectangle(12,20));
        System.out.println("are of circle="+sh.circle());
        sh.square(10);
    
	}
	public void triangle()
	{
		int b=10,h=23;
		double c=(0.5)*b*h;
        System.out.println("are of traiangle="+c);		
	}

	public int rectangle(int l,int b)
	{
		int c=l*b;
		return c;
	}
	public double circle()
	{   
		double r=10;
		double c=3.14*r*r;
		return c;
	}
	public void square(int a)
	{
		int c;
		c=a*a;
		System.out.println("area of circle="+c);
	}
	
}
