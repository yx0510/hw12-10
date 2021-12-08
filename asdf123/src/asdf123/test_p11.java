package asdf123;


public class test_p11 {

	public static void main(String[] args) {
		racingcar3 rccar1=new racingcar3();
		rccar1.setcar(1234, 20.5);
		rccar1.setcourse(5);
		rccar1.show();
	}
}
class car3{
	protected int num ;
	protected double gas;
	public car3() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
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
class racingcar3 extends car3{
	private int course ;
	public racingcar3() {
		course =0 ;
		System.out.println("生產了賽車");
	}
	public void setcourse(int c) {
		course = c ;
		System.out.println("將賽車號設為"+course);
	}
	public void show() {
		System.out.println("賽車車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}