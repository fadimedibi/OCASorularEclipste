package certifica1_50;

public class q01 {

	public static void main(String[] args) {
		Base b1=new DrivedB();// esas mesele referansi degil obj nin hangi class a ait oldugu
		Base b2=new DrivedA();
		Base b3=new DrivedB();// b3 ile b1 in ilk durumu ayni
		
		b1.test();
		b2.test();
		b3.test();
		
		
		b1=(Base)b3;// Base e cast etmese de sorun olmaz cunku zaten her ikisininde referansi base
		Base b4=(DrivedA) b3; // referansi cast ediyor b3 te obj yi DrivedB olusturdu
		b1.test(); // ==> b1 zaten DrivedB nin objesidir==>runtime-->drivedB method kullanilir
		b4.test();//==>son halinde referansi DrivedA da olsa b3 DrivedB nin objesi oldugundan run time da DrivedB deki metod kullanilir. 
		
double dVar=123;
	}

}
class Base{
	public void test() {
		System.out.println("Base");
	}
}
class DrivedA extends Base{
	public void test() {
		System.out.println("DrivedA ");
	}
}

class DrivedB extends DrivedA{
	public void test() {
		System.out.println("DrivedB");
	}
}