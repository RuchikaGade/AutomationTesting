package blocks;

public class block6 {
	block6(){
		this(10);
		System.out.println("i am zero prameter constructor");
	}
	block6(int i){
		
		System.out.println("i am int parameter constructor");
	}
	static {
		System.out.println("i am static block of class block6");
	}
	{
		int i=56;
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		block6 b1=new block6();
		System.out.println("***********");
		block6 b2=new block6();
		System.out.println("Main method ends");}
	
		static{
			System.out.println("i am static block2 of class block6");
		}
		{
			
			System.out.println("I am non static block2 of class block6");
		}

	}


