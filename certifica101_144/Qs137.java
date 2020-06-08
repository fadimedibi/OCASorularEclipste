package certifica101_144;

public class Qs137 {
public static void main (String[] args) {
	Merhaba check1 = new Merhaba();
	Merhaba check2 = new Merhaba();
	
	check1.changeCount();
	check2.changeCount();
	
	System.out.println(check1.i +" : "+ check1.count+ " : "+ check2.i+" : " + check2.count);
}
}

class Merhaba{
	static int  count=0;
	 int i=0;
	
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
			
		}
	}
	
}
