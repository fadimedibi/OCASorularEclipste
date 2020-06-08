package certifica51_100;

public class Q91 {

	public static void main(String[] args) {
		Test2 t1=new Test2();
		
		t1.var=300;
		System.out.println(t1.toString());
		
		Test2 t2=new Test2();
		t2.stVar=300;
		System.out.println(t2.toString());
		
	}
}

class Test2{
	public static int stVar=100;
	public int var=200;
	public String toString() {
		return var+";"+stVar;
	}
}