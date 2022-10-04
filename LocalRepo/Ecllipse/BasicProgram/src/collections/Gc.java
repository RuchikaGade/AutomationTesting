package collections;

public class Gc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gc g1=new Gc();
		System.out.println("Object representation of Gc :"+g1);
		System.out.println("Address of Gc:"+g1.hashCode());
		g1=null;
		System.gc();
	}
	protected void finalize() {
		System.out.println("hii I am finalize method");
		
		

	}

}
