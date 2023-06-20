package pkg;

public class Stringoperations {

	public static void main(java.lang.String[] args) {

		String s="hello";
		String s1="HELLO";
		String s2="How are you";
		String s3="hello";
		
	//concatination	
		System.out.println("concatination---");

		System.out.println(s.concat(s2));
		
	//equals
		System.out.println("equals-----");
		
		System.out.println(s.equals(s1));
		
	//equalsignorecase
		System.out.println("ignored case string is");

		System.out.println(s.equalsIgnoreCase(s1));

	//contains
		System.out.println("contains----");
		
		System.out.println(s2.contains("are"));
		
	//upper and lower case
		System.out.println("upper and lower case---");

		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		
	//trim
		System.out.println("trimmmed string-----");

		System.out.println(s2.trim());
		
	//length
		System.out.println("length of the string----");

		System.out.println(s.length());
		
	//start and end with
		System.out.println("ends with and starts with----");

		System.out.println(s2.startsWith("How"));
		System.out.println(s2.endsWith("You"));
//substring
		System.out.println(s2.substring(2,6));
//char
		System.out.println(s2.charAt(2));
//split
		String sr[]=s2.split(" ");
		for(String v:sr)
		{
			System.out.println(v);

		}


	}

}
