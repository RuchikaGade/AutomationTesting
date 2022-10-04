package encapsulation;
class demo3{
	private String name;
	public String getname() {
		return name;
}
	public void setname(String name) {
		this.name=name;
	}

}
public class Ex4 {

	public static void main(String[] args) {
		demo3 d3=new demo3();
		d3.setname("ruchika");
		System.out.println(d3.getname());

	}

}
