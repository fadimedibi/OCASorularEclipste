package certifica101_144;

public class Qs120 {

	public static void main(String[] args) {
		try {
			method1(); // buraya exception donmez
		}catch(MyException ne) {
			System.out.println("A");
		}

	}
	
	public static void method1() {
		try {
			throw Math.random()>0.5?new MyException():new RuntimeException();
		}catch(RuntimeException re) {// hangi exception gelirse gelsin bu parent oldugu icin onu tutar.
			System.out.println("B");
		}
	}
	
	
}
 class MyException extends RuntimeException{
	
}
	
	

