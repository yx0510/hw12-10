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
				System.out.println("��"+(i+1)+"�Ӫ���Ocar���O");
			else 
				System.out.println("��"+(i+1)+"�Ӫ��󤣬Ocar���O");
		}
	}
}
abstract class vehicle1{
	protected int speed ;
	public void setspeed(int s) {
		speed = s ;
		System.out.println("�N�t�׳]��"+speed);
	}
	abstract void show();
}
class car10 extends vehicle1{
	private int num;
	private double gas;
	public car10 (int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�t�׬O"+speed);
	}
}
class plane1 extends vehicle1{
	private int flight;
	public plane1 (int f) {
		flight = f ;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}
}
