package array;

public class Array0 {

	public static void main(String[] args) {
		String[]cars=new String[4];
		cars[0]="volvo";
		cars[1]="BMW";
		cars[2]="ford";
		cars[3]="mazda";
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars.length);
		System.out.println("***********NORMAL FOR LOOP");
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		

	}

}
