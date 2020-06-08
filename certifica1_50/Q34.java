package certifica1_50;

public class Q34 {

	public static void main(String[] args) {
		String names[]= {"Thomas", "Peter", "Joseph"};
		String pwd[]=new String [3];
		int idx=0;
		
		try {
			for(String n: names) {			//index 0 --> Thomas-->omas
				pwd[idx]=n.substring(2,6);	// index 1 -->peter 5 harfli oldugundan exception olup catch bloguna atliyor.
				idx++;
			}
		}catch(Exception e) {
			System.out.println("invalid Name");// bu basiliyor
		}
		
		for(String p:pwd) {
			System.out.println(p);			// array e sadece index 0 yuklenebildiginden diger iki index null oluyor
		}
		
		//what is the result?
		
	}
}
