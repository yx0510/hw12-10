package asdf123;

public class test_p06 {

	public static void main(String[] args) {
		racingcar rccar2=new racingcar(1234,20.5,5);

	}

}
class car{
	private int num ;
	private double gas;
	
	public car(int n,double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量"+gas+"的車子");
	}
	public void setcar(int n , double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"汽油量"+gas);		
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class racingcar extends car{
	private int course ;
	public racingcar(int n,double g,int c) {
		super(n,g);
		course =c ;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setcourse(int c) {
		course = c ;
		System.out.println("將賽車號設為"+course);
	}
}