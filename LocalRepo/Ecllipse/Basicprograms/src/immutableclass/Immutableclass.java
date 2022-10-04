package immutableclass;
final class testimmutableclass{
	final String name;
	final int salary;
	testimmutableclass(String s1,int num1){
		name =s1;
		salary=num1;
	}
	public String getname() {
		return name;
	}
	  public int getsalary() {
		return salary;
	}
}
public class Immutableclass {
	public static void main(String[] args) {
testimmutableclass t1=new testimmutableclass("ruchi",2600);
		System.out.println(t1.getname());
		System.out.println(t1.getsalary());
		testimmutableclass t2=new testimmutableclass("ruchi2",2800);
		System.out.println(t2.getname());
		System.out.println(t2.getsalary());

	}

}
