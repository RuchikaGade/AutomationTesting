package basicprogram;

 class Thiskeyword6 {
	 int variable=51;
public static void main(String[] args) {
		Thiskeyword6 obj=new Thiskeyword6();
			obj.method(20);
			obj.method();
			System.out.println("value of instance variable:"+obj.variable);}
			void method(int variable) {
				System.out.println("value of local variable:"+variable);
				variable=10;
				System.out.println("value of local variable:"+variable);
				System.out.println("value of instance variable:"+this.variable);
				this.variable=variable;
				System.out.println("value of local variable:"+variable);
				System.out.println("value of instance variable:"+this.variable);
			}
			void method() {
				int variable=40;
				System.out.println("value of instance variable:"+this.variable);
				System.out.println("value of local variable:"+variable);
				this.variable=variable;
				System.out.println("value of local variable:"+variable);
				System.out.println("value of instance variable:"+this.variable);
			}
			{

	}

}
