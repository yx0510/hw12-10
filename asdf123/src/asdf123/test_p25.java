package asdf123;


public class test_p25 {

	public static void main(String[] args) {
		car7 car1 = new car7();
		car7 car2 = new car7();
		car7 car3;
		car3 = car1;
		System.out.println("car1�Pcar2�ۦP"+car1.equals(car2));
		System.out.println("car1�Pcar3�ۦP"+car1.equals(car3));
	}
}
class car7{
	protected int num ;
	protected double gas;
	public car7() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
}
