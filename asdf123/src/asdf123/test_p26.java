package asdf123;


public class test_p26 {

	public static void main(String[] args) {
		car8[] cars = new car8[2];
		cars[0] = new car8();
		cars[1] = new racingcar8();
		for(int i=0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		}
	}
}
class car8{
	protected int num ;
	protected double gas;
	public car8() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
}
class racingcar8 extends car8{
	public racingcar8() {
		System.out.println("�Ͳ��F�ɨ�");
	}
}

