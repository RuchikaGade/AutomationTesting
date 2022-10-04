package encapsulation;

 class Ex6 {
private String college="Raisoni";
public String getcollege() {
	return college;

}}
class ReadOnly{
	public static void main(String[] args) {
		Ex6 e1=new Ex6();
		System.out.println(e1.getcollege());

	}

}
