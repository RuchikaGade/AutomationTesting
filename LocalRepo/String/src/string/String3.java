package string;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I am from up ,I am working at Accenture, I working as a QA Delievery head";
		System.out.println("Actual string s1:"+s1);
		String  sa[]=s1.split(" ");
		for (String s:sa) {
			System.out.println("printing on basis of space:"+s);
			String s2="I am from Amravati";
			System.out.println("Actual string:"+s2);
			String str[]=s2.split(" ",3);
			for(String ss:str) {
			System.out.println(ss);
			String s3="I am from Pune";
			String rr[]=s3.split(" ");
			for(String sss:rr) {
				System.out.println(sss);
				String rrr[]=s3.split("4");
				for(String ee:rrr) {
					System.out.println(ee);
					String s5="I am Ruchi";
					System.out.println("printing s5:"+s5);
					System.out.println("length:"+s5.length());
					System.out.println("actual string without spaces:"+s5.trim());
					System.out.println("actual length without spaces:"+s5.trim().length());
					String s6="I     am       Ruchi";
					System.out.println("Actual length without spaces:"+s6.trim());
					System.out.println("Actul length:"+s6.trim().length());
					//String bb[]=s5.
				}
			}
		}
	}

}
}