package asdf123;


public class test_p14 {

	public static void main(String[] args) {
		car4 car1;
		car1 = new racingcar4();
		car1.setcar(1234, 20.5);
		car1.show();
	}
}
class car4{
	protected int num ;
	protected double gas;
	public car4() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setcar(int n , double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�T�o�q"+gas);		
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class racingcar4 extends car4{
	private int course ;
	public racingcar4() {
		course =0 ;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setcourse(int c) {
		course = c ;
		System.out.println("�N�ɨ����]��"+course);
	}
	public void show() {
		System.out.println("�ɨ������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}
