package asdf123;


public class test_p17 {

	public static void main(String[] args) {
		car5 cars[] = new car5[2];
		cars[0] = new car5();
		cars[0].setcar(1234, 20.5);
		
		cars[1] = new racingcar5();
		cars[1].setcar(4567, 30.5);
		
		for(int i=0 ; i<cars.length;i++)
			cars[i].show();
	}
}
class car5{
	protected int num ;
	protected double gas;
	public car5() {
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
class racingcar5 extends car5{
	private int course ;
	public racingcar5() {
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