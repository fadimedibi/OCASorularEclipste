package certifica101_144;

public class Qs103 {
	
	public static void main(String[] args) {
		
		C c=new C();
		//obj olusturulurkan constructer ile olusturulur ve otomatik olarak constructer cagirilmis olur.
		
	}
}

class A1{
	public A1() {		
		System.out.println("A ");
	}
	
}

class B extends A1{
	public B() {				// line n1
		//super(); cagirilan her constructerin icinde default olarak super constructor olusturulur.
		System.out.println("B ");
	}
}

class C extends B{
	public C() {				//line n2
		//super();
		System.out.println("C ");
	}
}