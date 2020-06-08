package certifica1_50;

public class Q20 {

	public static void main(String[] args) {
		String str1="Java";
		String[] str2= {"J","a","v","a"};
		String str3="";
		for(String str:str2) {
			str3=str3+str;//>>>>>>>>>str3="Java"
		} 
		//they are not same object only they have same content.
		//            false
		boolean b1=(str1==str3); 
		//             true>>>>"Java".equals("Java")
		boolean b2=(str1.equals(str3)); 
		System.out.println(b1+ ", "+b2);
	}
}
