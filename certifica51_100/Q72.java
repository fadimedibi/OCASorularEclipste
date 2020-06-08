package certifica51_100;

public class Q72 {

	//static int count; //==> duzeltmek icin
		int  count;
	public static void displayMsg() {//==> static alanda static olmayan degisken cagirilmaz.
		count++;												//line n1
		System.out.println("Welcome "+"Visit Count: "+count);	//line n2
	}
	
	public static void main(String[] args) {
		Q72.displayMsg();	//==> method static oldugundan 			//line n3
		Q72.displayMsg();	//==> class ismiyle cagirilabilir		//line n4
	}						//==> sorun olmaz.
}

// what is the result?
// answer:
// Compilation fails at line n1 and n2