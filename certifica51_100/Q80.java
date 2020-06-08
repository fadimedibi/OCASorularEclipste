package certifica51_100;

public class Q80 {
	
	private char var;
	
	public static void main(String[] args) {
		
		char var1='a';//a
		char var2=var1;//a
		var2='e';//e
		
		Q80 obj1=new Q80();
		Q80 obj2=obj1;	 // obj2--> obj1 i gosterdiginden ikiside ayni degiskeni cagirir. 
		obj1.var='i';
		obj1.var='o';	 // degiskene atanan son deger bu dur.
		                // a         e
		System.out.println(var1+", "+var2);
		                //   o           o
		System.out.println(obj1.var+", "+obj2.var);
	}
}

