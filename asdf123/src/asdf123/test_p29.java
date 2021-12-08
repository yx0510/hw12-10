package asdf123;



import asdf123.car9;
import asdf123.plane;
import asdf123.vehicle;

public class test_p29 {
	public static void main(String[] args) {
		vehicle[] vc = new vehicle[2];
		vc[0] = new car9(1234,20.5);
		vc[0].setspeed(60);
		vc[1] = new plane(232);
		vc[1].setspeed(5000);
		for(int i=0;i<vc.length;i++)
			vc[i].show();
	}
}
abstract class vehicle{
	protected int speed ;
	public void setspeed(int s) {
		speed = s ;
		System.out.println("將速度設為"+speed);
	}
	abstract void show();
}
class car9 extends vehicle{
	private int num;
	private double gas;
	public car9 (int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class plane extends vehicle{
	private int flight;
	public plane (int f) {
		flight = f ;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}
