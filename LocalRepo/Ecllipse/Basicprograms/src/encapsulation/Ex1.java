package encapsulation;
class demo{
	private int empId=1000;
	private double salary=45000;
	public int getempId() {
		return empId;
	}
	public double getsalary() {
		return salary;
	}
	public void setempId(int id) {
		empId=id;
	}
	public void setsalary(double sal) {
		salary=sal;
	}
}
public class Ex1 {

	public static void main(String[] args) {
		demo d1=new demo();
		System.out.println(d1.getempId());
		System.out.println(d1.getsalary());
		double updatedsalary=d1.getsalary()+14000;
		System.out.println("updatedsalary:"+updatedsalary);
		System.out.println(d1.getsalary());
		System.out.println("***************");
		d1.setsalary(12345);
		d1.setempId(67890);
		System.out.println(d1.getsalary());
		System.out.println(d1.getempId());

	}

}
