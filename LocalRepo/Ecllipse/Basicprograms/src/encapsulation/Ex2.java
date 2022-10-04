package encapsulation;
class person{
	private String name;
	public String getname() {
		return name;
	}
	public void setname(String newname) {
		this.name=newname;
	}
}
public class Ex2 {

	public static void main(String[] args) {
		person p1=new person();
//p1.name="ruchi";					error
	p1.setname("RUCHI");
	System.out.println(p1.getname());
	}
}
