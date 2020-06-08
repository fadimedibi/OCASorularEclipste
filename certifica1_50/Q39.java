package certifica1_50;

public class Q39{
	public static String maskCC (String creditCard) {
		String x="xxxx-xxxx-xxxx-";
		//line n1
	//	return x+creditCard.substring(15,19);
		
		StringBuilder sb=new StringBuilder(x);
		sb.append(creditCard, 15, 19);
		return sb.toString();
		
//		StringBuilder sb1=new StringBuilder(creditCard);--->
//		sb1.substring(15, 19);				-----> StringBuilder da subString degil append methodu ile eklenir.
//		return x+sb1;
		
	}
	
	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9101-1121"));
	}
}