package pkg;

class Member
 { 
	String name;
	 int age;
	 int phone;
	 String address;
	 int salary;
	 
	
	public void Details()
	{
	 System.out.println("name="+name);
	 System.out.println("address="+address);
	 System.out.println("age="+age);
	 System.out.println("phone="+phone);
	 System.out.println("salary="+salary);

	}
	
 }
class Employee extends Member
{ 
	String speciali;
	
}


class Member1 extends Member
{
	String dpt;

	
}
public class Inheritprgm {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.name="arun";
		emp.address="kalpeta";
		emp.age=23;
		emp.phone=98765;
		emp.salary=7899;
		emp.Details();
		System.out.println(emp.speciali="tester");
		Member1 mem=new Member1();
		mem.Details();
		System.out.println(mem.dpt="cs");
}
}