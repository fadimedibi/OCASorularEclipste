package certifica101_144;

public class Test {

	public static void main(String[] args) {
		
		int num[]=new int[5];
		num[0]=5;
		num[1]=3;
		num[3]=7;
		
		//System.out.println(Array.toString(num));
		
		System.out.println(num.length);
		
		String a="";
		System.out.println(a.length());
		
		String b=null;
		//System.out.println(b.length());
		
		String c="hello";
		c.indexOf("k");
		System.out.println(c.indexOf("k"));
		
		String d=c.concat(" world!");
		System.out.println(c);
		System.out.println(d);
		
		String s=d.substring(2, 8);
		
		System.out.println(s);
		
	}

}
