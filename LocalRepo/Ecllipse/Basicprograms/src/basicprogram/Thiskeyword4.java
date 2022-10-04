package basicprogram;
class Thiskeyword4 {
	int age;
	void call() {
		System.out.println("I am call method");
	}
	void m(int age) {
		System.out.println("Local age:"+age);
		System.out.println("Global age:"+this.age);
		this.call();
		System.out.println("this keyword value is:"+this);
		}
	public static void main(String[] args) {
		Thiskeyword4 obj=new Thiskeyword4();
		System.out.println("object obj value is:"+obj);
		obj.m(35);

	}
}

