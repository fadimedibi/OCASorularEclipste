package certifica1_50;

public class q46 {

	public static void main(String[] args) {
		
	}
}
 class Test {
	  int a1;
	 public static void doProduct(int a) {
		 a=a*a;
	 }
	 
	 public static void doString(StringBuilder s) {
		 s.append(" "+s);
	 }
	 
	 public static void main(String[] args) {
		Test item=new Test();
		item.a1=11;
		StringBuilder sb=new StringBuilder("Hello");
		Integer i=10;
		
		doProduct(i); // metodu kullanmis ama olsan degeri bir degiskene atamamis.---> IMMUTABLE
		doString(sb); 
		doProduct(item.a1);// metodu kullanmis ama olsan degeri bir degiskene atamamis.--> IMMUTABLE
		
		System.out.println(i+" "+sb+" "+item.a1);
				
				
				
				
	}
	 
	 
 }