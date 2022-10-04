package basicprogram;

 class Thiskeyword55 {
	 int variable=5;
	 int age=10;
public static void main(String[] args) {
		Thiskeyword55 obj=new Thiskeyword55();
		obj.method(20);
		obj.method();
		System.out.println("obj GV variable:"+obj.variable);
		Thiskeyword55 obj2=new Thiskeyword55();
		System.out.println("obj2 GV variable:"+obj2.variable);}
		void method(int variable) {
			System.out.println("value of variable:"+variable);
			System.out.println(" GV value of variable:" + this.variable);
			this.variable=variable;
			System.out.println("value of variable:"+ variable);
			System.out.println("GV value of variable:"+this.variable);
			}
		void method() {
			int variable=40;
			System.out.println("valiue of variable:"+variable);}
		{
		

	}

}
