package string;

public class StringSampleProgram {

	public static void main(String[] args) {
		String s1="Core javaBasics";
		System.out.println("String length:"+s1.length());
		System.out.println("Characters at 3rd position:"+s1.charAt(3));
		System.out.println("subString from index 3:"+s1.substring(3));
		System.out.println("SubString from index:"+s1.substring(2,5));
		String s2="core";
		String s3="java basics";
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("concataned String:"+s2.concat(s3));
		String p1="pune";
		String p2="Mumbai";
		String x1=s2.concat(s3);
		String x2=p1.concat(p2);
		String x3=p1+p2;
		String x4= x1.concat(x2);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		
		
	}

}
