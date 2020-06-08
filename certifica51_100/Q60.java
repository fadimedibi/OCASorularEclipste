package certifica51_100;

public class Q60 {
	public static void main(String[] args) {
		Q60 ts=new Q60();
		System.out.println(isAvailable+" "); //false
		isAvailable=ts.doStuff();		//true
		System.out.println(isAvailable);	//true
	}
	
	public static boolean doStuff() {
		return !isAvailable;	// true;
	}
	static boolean isAvailable=false;
}
