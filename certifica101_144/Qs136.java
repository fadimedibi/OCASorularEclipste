package certifica101_144;

public class Qs136 {
	//static int ans;
	public static void main(String[] args) {
		
		try {
			int num=10;
			int div=0;
			int ans=num/div;	// ans sadece bu blok icin tanimli local variable
		}catch(ArithmeticException ae) {
			ans=0;       						//line n1  ==> burada tekrar tanimlanmasi gerekli
		}catch(Exception e) {
			System.out.println("Invalid calculation");
		}
		
		System.out.println("Answer= "+ans);       //line n2  ==> ya da sinifin static variable i olarak ustte tanimlanmali
	}

}
