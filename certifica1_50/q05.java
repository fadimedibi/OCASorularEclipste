package certifica1_50;

public class q05 {

	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is "+ (x+y));
	}
	public static void doSum(double x, double y) {
		System.out.println("double sum is "+ (x+y));
	}
	public static void doSum(int x, int y) {
		System.out.println("int sum is "+ (x+y));
	}
	
	public static void doSum(float x, float y) {
		System.out.println("float sum is "+ (x+y));
	}
//	public static void doSum(long x, long y) {
//		System.out.println("long sum is "+ (x+y));
//	}
	
	public static void main(String[] args) {
		doSum (10,20); // tam sayilarda tip belirlenmediginde defoult olarak int kabul edilir
		doSum(10.0 ,20.0);// ondalikli sayilarda tip belirlenmediginde defoult olarak double kabul edilir
	}
}

//byte ==> short ==> int ==> long ==> float ==> double ==> Integer ==> Double ==> Object
// defoult noktadan baslar eger o yoksa uste dogru cikar
// double olmasaydi==> Integer i secerdi.
// int olmasaydi double gecerdi cunku long icin soninda L float icin de F olmali