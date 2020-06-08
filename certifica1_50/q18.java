package certifica1_50;

public class q18 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();

		sb.append("hello");
		
		System.out.println(sb);
		// there are two methods in string builder
		//		sb.delete(start index, end index)
		//		sb.deleteCharAt(index)
		
		//sb.delete(0, sb.length());
		sb.delete(2,4);
		System.out.println(sb);
		
		
	/*	
		A. sb. deleteAll ();
		B. sb. delete (0, sb. size () );
		C. sb. delete (0, sb. length () );
		D. sb. removeAll ();
	*/	
	}
}
