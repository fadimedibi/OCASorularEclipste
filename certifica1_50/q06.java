package certifica1_50;

public class q06 {

	public static void main(String[] args) {
		Boolean[]bool=new Boolean[2];
		
		bool[0]=new Boolean (Boolean.parseBoolean("true"));// string i booleana ceviren method
		bool[1]=new Boolean(null);
		System.out.println(bool[0]+" "+bool[1]);
		
	}

}
 //Boolean.parseBoolean("true") metodunda parametre true(True,TRUE) disinda her ne olursa olsun sonuc false dur
// bu Boolean wrapper class icin de gecerli