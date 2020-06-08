package certifica1_50;

public class Q45 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Duke");
		String str1=sb1.toString();
		// insert code here
//		String str2=str1; //==> dogru cevap
//		String str2=new String(str1); //==>yeni bir String olusturuldu
//		String str2=sb1.toString();	  //==>yeni bir String olusturuldu
		String str2="Duke";			  //==>yeni bir String olusturuldu
		
		
		System.out.println(str1==str2);
	}
}
 // which code fragment when inserted the line will print true?