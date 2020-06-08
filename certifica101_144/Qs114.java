package certifica101_144;

public class Qs114 {

	public static void main(String[] args) {
		Short s1=200;
		Integer s2=400;
		Long s3=(long)s1+s2;			// line n1 --> short ve integer long a cast edilebilir
		String s4=(String)(s3*s4);		// line n2 --> Stringe donusturmek icin toString kullanilmali
		System.out.println("sum is "+s4);
		
	}

}
// what is the result?