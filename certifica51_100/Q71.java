package certifica51_100;

public class Q71 {

	public static void main(String[] args) {
			//line n1
		// dogru cavaplar:
		//byte x=1;
		//short x=1;
		//Integer x =new Integer("1");
		//Integer x =new Integer(1);
		//int x=1;
		//byte<short<int<long<float<double
		
		
		//yanlis cevaplar:
		//double x=1;
		//String x="1";
		//long x=1;
		//Double x=1;
		
		Byte x=1;
		// char x='2';
		//we can use int char and string in switch case
		switch(x) {
			case 1:
				System.out.println("one");
				break;
				
			case 2:
				System.out.println("two");
				break;
		}
	}
	
}
// which three code fragment can be independently inserted at line n1 to enable the code print one?