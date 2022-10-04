package basicprogram;

 class Thiskeyword5 {
	int variable=5;
	int age=10;

	public static void main(String[] args) {
		Thiskeyword5 obj=new Thiskeyword5();
		obj.method(20);
		obj.method();
		System.out.println("obj GV variable:"+obj.variable);
		Thiskeyword5 obj2=new Thiskeyword5();
		System.out.println("obj2 GV variable:"+obj2.variable);
		}
	void method(int variable) {
		System.out.println("value of variable:"+variable);
	}
	//System.out.println("GV value of variable : "+ this.variable)
	//this.variable=variable;
	//System.out.println("value of variable:"+variable);
	//System.out.println("value of variable:"+variable));
 
 void method() {
	 int variable=40;
	 System.out.println("value of variable:"+variable);

}
}