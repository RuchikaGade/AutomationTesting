package basicprogram;
class student101{
	int rollno;
	float fee;
	student101(int rollno){
		
	this.rollno=rollno;	
	}
	student101(int rollno,float fee){
	this(111);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+""+fee);
	}
	}

 class Thisstatement3 {
	public static void main(String[] args) {
		System.out.println("creating s1 object");
		student101 s1=new student101(101);
		System.out.println(s1.rollno);
		System.out.println("creating object s2");
		student101 s2=new student101(400,2000.23f);
		System.out.println(s2.rollno+""+s2.fee);
		System.out.println("************display method******");
		s1.display();
		s2.display();

		
	}

}
