package asdf123;

public class test_p04 {

	public static void main(String[] args) {
		racingcar1 rccar1;
		rccar1 = new racingcar1();
		rccar1.setcar(1234, 20.5);
		rccar1.setcourse(5);
	}

}
class car1{
	private int num ;
	private double gas;
	
	public car1() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setcar(int n , double g) {
		num = n;
		gas = g;
		System.out.println("�N�����w�]��"+num+"�T�o�q"+gas);		
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class racingcar1 extends car1{
	private int course ;
	public racingcar1() {
		course =0 ;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setcourse(int c) {
		course = c ;
		System.out.println("�N�ɨ����]��"+course);
	}
}