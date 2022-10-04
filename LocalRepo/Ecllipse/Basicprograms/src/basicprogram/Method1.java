package basicprogram;

public class Method1 {
	 static double salary=10000.67;
	   static int empId=1001;   
	   public static int printEmpID(){
		   System.out.println("printEmpID is running..");
		   return 1011;
	   }   
	   public static void printEmpSal(){
		   System.out.println("printEmpSal is running.."+salary);
	   }   
	 

	public static void main(String[] args) {
	int age=30;
	System.out.println("age:"+age);
	//System.out.println("empId:"+empId);
	Method1.printEmpID();

	}

}
