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
class racingcar5 extends car5{
	private int course ;
	public racingcar5() {
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