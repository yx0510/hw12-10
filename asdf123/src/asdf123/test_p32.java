package asdf123;

import asdf123.car10;
import asdf123.plane1;
import asdf123.vehicle1;

public class test_p32 {
	public static void main(String[] args) {
		vehicle1[] vc = new vehicle1[2];
		vc[0] = new car10(1234,20.5);
		vc[1] = new plane1(232);
		for(int i=0;i<vc.length;i++) {
			if(vc[i]instanceof car10)
				System.out.println("第"+(i+1)+"個物件是car類別");
			else 
				System.out.println("第"+(i+1)+"個物件不是car類別");
		}
	}
}
abstract class vehicle1{
	protected int speed ;
	public void setspeed(int s) {
		speed = s ;
		System.out.println("將速度設為"+speed);
	}
	abstract void show();
}
class car10 extends vehicle1{
	private int num;
	private double gas;
	public car10 (int n,double g) {
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
class plane1 extends vehicle1{
	private int flight;
	public plane1 (int f) {
		flight = f ;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}
