package asdf123;


public class test_p24 {

	public static void main(String[] args) {
		car6 car1 = new car6();
		car1.setcar(1234, 20.5);
		System.out.println(car1);
	}
}
class car6{
	protected int num ;
	protected double gas;
	public car6() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setcar(int n , double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�T�o�q"+gas);		
	}
	public String toString() {
		String str ="����:"+num+",�T�o�q"+gas;
		return str;
	}
}

