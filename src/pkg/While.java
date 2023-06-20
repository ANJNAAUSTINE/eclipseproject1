package pkg;

public class While {

	public static void main(Stringoperations[] args) {

		
	//	int a=1;
	//	while(a<=10)
	//	{
	//		System.out.println(a);
	//		a++;
	//	}
		int n=345,l=0;
		while(n>0)
		{
			n=n/10;     //345/10=34     //34/10=4         //4/10=0 (exit the cpndition)
			l++;        //1             //2               //3
			//System.out.println(l);
		}
		System.out.println(l);

	}

}
