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
class racingcar3 extends car3{
	private int course ;
	public racingcar3() {
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