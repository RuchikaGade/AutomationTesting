package string;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String1 c1=new String1();
		System.out.println("c1:"+c1);// string representation of the object bcz of tostring
		String s1="Mumbai";//new object created in string constant pool
		String s2="Mumbai";	//no object will created as its duplicate object
		String s3="Banglore";	//new object will created in string constant pool
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("char length:"+s1.length());
		System.out.println("char length:"+s2.length());
		System.out.println("char length:"+s3.length());
		System.out.println("comparison baesd on values:"+s1.equals(s2));
		System.out.println("compasion baesd on address:"+(s1==s2));
		System.out.println("comparison based on values:"+s1.equals(s3));
		System.out.println("comparison based on address:"+(s1==s3));
		String s4=new String("Mumbai");
		System.out.println("comparison on basis of value:"+s1.equals(s4));
		System.out.println("comparison on basis od address:"+(s1==s4));
		String s5=new String("Mumbai");
		System.out.println("compasion on basis of valus:"+s4.equals(s5));
		System.out.println("comparison on the basis of address:"+(s4==s5));
		//String s5=new string("Amravati");
		//System.out.println("hhhha:"+s5);
		
	}

}
