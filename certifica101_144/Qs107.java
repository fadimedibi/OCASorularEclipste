package certifica101_144;

public class Qs107 {
public static void main(String[] args) {
		
		A2 b1=new A2();
		A2 b2=new C1();
		b1=(A2)b2;
		A2 b3=(B1) b2;
	//	A2 b3=(B1) b2;
		
//		b1.test(); // normalde A verir ama A2 ye cast yapilip b2 ya esitlenince C verir
//		b2.test(); // C
		b3.test();

		
	}
}

class A2{
	public void test() {		
		System.out.println("A ");
	}
	
}

class B1 extends A2{
	public void test() {				
		System.out.println("B ");
	}
}

class C1 extends A2{
	public void test() {				
		System.out.println("C ");
	}
}

