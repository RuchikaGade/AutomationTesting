package basicprogram;

 class Thiskeyword21 {
	 int a;
	 int b;
	 Thiskeyword21(int a,int b){
		 this.a=a;
		 this.b=b;
	 }
void display() {
	System.out.println("a="+a+"b="+b);
}
	public static void main(String[] args) {
Thiskeyword21 s1=new Thiskeyword21(10,20);
s1.display();
System.out.println(s1.a+""+s1.b);
Thiskeyword21 s2=new Thiskeyword21(101,102);
s2.display();
System.out.println(s2.a+""+s2.b);


	}

}
