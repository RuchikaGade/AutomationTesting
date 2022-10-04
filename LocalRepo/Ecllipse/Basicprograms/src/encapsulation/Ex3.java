package encapsulation;
class demo1{
	private int ssn;
	private String empname;
	private int empage;
	public int getssn() {
		return ssn;
	}
	public String getempname() {
return empname;
}
	public int getempage() {
		return empage;
	}
	public void setempage(int newvalue) {
		empage=newvalue;
	}
	public void setempname(String newvalue) {
		empname=newvalue;
	}
	public void setssn(int newvalue) {
		ssn=newvalue;
	}
}
public class Ex3 {

	public static void main(String[] args) {
		demo1 d1=new demo1();
		System.out.println("employee name:"+d1.getempname());
		System.out.println("employee age:"+d1.getempage());
		System.out.println("employee ssn:"+d1.getssn());
		System.out.println("**********************");
		d1.setempname("Babdu");
		d1.setempage(26);
		d1.setssn(123456);
		System.out.println("employee name:"+d1.getempname());
		System.out.println("employee age:"+d1.getempage());
		System.out.println("employee ssn:"+d1.getssn());

	}

}
