package certifica51_100;

public class Q64 {

	public static void main(String[] args) {
		
		Q64 ex=new Q64();
		int cardNo=12344;
		ex.checkCard(cardNo);	//line n2		// Runtime Exception oldugundan burda uyari vermiyor. bu exception runtime da ortaya cikiyor.
		ex.readCard(cardNo);	//line n3		// Runtime disindaki exception lari compile kontrol edip uyari veriyor
	}
	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	void checkCard(int cardNo) throws RuntimeException{ //line n1
		System.out.println("Cecking Card");
	}
}
