package asdf123;


public class test_p41 {
	public static void main(String[] args) {
		car12 car1 = new car12(1234,20.5);
		car1.vshow();
		car1.mshow();
	}
}
interface ivehicle1{
	void vshow();
}
interface imaterial{
	void mshow();
}
class car12 implements ivehicle1 , imaterial{
	private int num;
	private double gas;
	public car12 (int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量"+gas+"的車子");
	}
	public void vshow() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void mshow() {
		System.out.println("車子的材質是鐵");
	}
}