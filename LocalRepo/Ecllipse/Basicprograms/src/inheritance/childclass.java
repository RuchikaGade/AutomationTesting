package inheritance;

class Parentclass {
void Partclass(int a){
System.out.println("This is parent class :" +a);
}}
class child extends Parentclass{
	child(double b){
		System.out.println("I am costrucor of child class:"+b);
	}
}
 class Childclass {
	public static void main(String[] args) {
Childclass C1=new Childclass();
//C1.Partclass(5);

}
}