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
		System.out.println("生產了車子");
	}
	public void setcar(int n , double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"汽油量"+gas);		
	}
	public String toString() {
		String str ="車號:"+num+",汽油量"+gas;
		return str;
	}
}

