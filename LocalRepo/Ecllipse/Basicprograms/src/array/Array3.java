package array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numbers= {2,-9,0,5,12,-25,22,9,8,12};
		double sum=0;
		double average;
		for(int number:numbers) {
			sum=sum+number;
		int arraylength=numbers.length;
		average=sum/arraylength;
		System.out.println("sum="+sum);
		System.out.println("average:"+average);
		}

	}

}
