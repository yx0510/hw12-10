package asdf123;


public class test_p38 {
	public static void main(String[] args) {
		ivehicle[] ivc = new ivehicle[2];
		ivc[0] = new car11(1234,20.5);
		ivc[1] = new plane2(232);
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}
interface ivehicle{
	int weight = 1000;
	void show();
}
class car11 implements ivehicle{
	private int num;
	private double gas;
	public car11 (int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class plane2 implements ivehicle{
	private int flight;
	public plane2 (int f) {
		flight = f ;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O"+flight);
	}
}
