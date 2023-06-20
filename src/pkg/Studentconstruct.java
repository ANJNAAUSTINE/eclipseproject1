package pkg;

public class Studentconstruct {
	 int studentid;
	 String studentname;
     
	 public Studentconstruct(int studentid,String studentname)
	 {
		 this.studentid=studentid;
		 this.studentname=studentname;
	 }
	
	public static void main(String[] args) {
       
		Studentconstruct s=new Studentconstruct(101,"anu");
		s.display();
		}
	public void display()
	{
		System.out.println("student id is="+studentid);
		System.out.println("student name is="+studentname);

	}

}
