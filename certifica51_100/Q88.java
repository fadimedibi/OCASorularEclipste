package certifica51_100;

public class Q88 {

	public static void main(String[] args) {
		
		Alpha ref1=new Alpha(50);
		Alpha ref2=new Alpha(125);
		Alpha ref3=new Alpha(100);
		ref1.doPrint();		// ns=50, s=50
		ref2.doPrint();		// ns=125, s=125
		ref3.doPrint();		// ns=0,  s=125 
	}
}
class Alpha {
	int ns;
	static int s;
	Alpha(int ns){	
		if(s<ns) {	//ref 3 te s=125 ns=100 oldugundan if bloguna hic girmez
			s=ns;
			this.ns=ns;	// dolayisiyla bu alanda this.ns e atama yapilamaz 
		}
	}
	void doPrint() {
		System.out.println("ns= "+ns+" s+ "+s); // burada class a ait ns kullanilacagindan ref3 icin ns 0 olur.
	}
}