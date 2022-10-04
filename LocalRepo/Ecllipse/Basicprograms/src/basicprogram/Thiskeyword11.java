package basicprogram;
class student1{
	int rollno;
	float fee;
	student1(int rollno,float fee){
		System.out.println("local rollno:"+rollno);
		System.out.println("local fee:"+fee);
		System.out.println("global rollno:"+this.rollno);
		System.out.println("global fee:"+this.fee);
		this.rollno=rollno;
		this.fee=fee;
		System.out.println("after update global rollno value:"+this.rollno);
		System.out.println("after update global fee value:"+this.fee);
	}
	void display(){
		System.out.println(rollno+""+fee);
	}
	}
class Thiskeyword11 {
public static void main(String[] args) {
	System.out.println("reference variable s1");
		student1 s1=new student1(111,5000f);
	s1.display();
	System.out.println("reference variable s2");
	student1 s2=new student1(112,6000f);
	s2.display();

	}

}
