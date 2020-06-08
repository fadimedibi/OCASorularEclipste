package certifica101_144;

public class Q129 {
public static void main(String[] args) {
	int x=1;
	int y=0;
	if(x++>++y) {
		System.out.println("hello");
	}else {
		System.out.println("welcome");
	}
	System.out.println("log"+x+":"+y);
}
}
