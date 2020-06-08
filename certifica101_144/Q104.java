package certifica101_144;

public class Q104 {

	public static void main(String[] args) {
		int var1=200;
		System.out.print((doCal(var1)));
		System.out.print(" "+var1);
		// var1 static degil doCal metodu static dolayisiyla var1 e atanan deger aktarilmiyor.
	}
	static int doCal(int var1) {
		var1=var1*2;
		return var1;
	}
}
