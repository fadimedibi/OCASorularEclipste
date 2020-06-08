package certifica101_144;

public class Qs111 {
public static void main(String[] args) {
	
	int x=100;
	System.out.println(x);
	int a=x++;// a=100  x a ya atandiktan sonra a bir artiyor
	System.out.println(a);
	System.out.println(x);
	int b=++x;	// b=102 x=101 iken bir arttirildiktan sonra b ye ataniyor
	System.out.println(b);
	System.out.println(x);
	int c=x++;	// c=102 x c ye atandiktan sonra bir arttiriliyor
		// burda artik c=103 
	System.out.println("c"+c);
	System.out.println(x);
	int d =(a<b)?(a<c)? a:(b<c)?b:c:x;
	System.out.println(d);
}
}