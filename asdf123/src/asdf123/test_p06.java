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
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q"+gas+"�����l");
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
class racingcar extends car{
	private int course ;
	public racingcar(int n,double g,int c) {
		super(n,g);
		course =c ;
		System.out.println("�Ͳ��F�s����"+course+"���ɨ�");
	}
	public void setcourse(int c) {
		course = c ;
		System.out.println("�N�ɨ����]��"+course);
	}
}