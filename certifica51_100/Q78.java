package certifica51_100;

public class Q78 {

	public static void main(String[] args) {
		Caller c=new Caller();
		c.start();	// method lar private oldugundan class disinda gorulemez.
		c.init();	// method lar private oldugundan class disinda gorulemez.

	}

}
class Caller{
	protected void init() {
		System.out.println("Initialized");
	}
	
 public void start() {
		init();
		System.out.println("Sterted");
	}
	
}

// Compilation error.