package certifica51_100;

public class q85 {

}

abstract class A3{
	private static int i;
	public void doStuff() { }
	public A3() {}
	// burda tanimlanmamis method olmamasi sorun degil mi?
}

final class A1{
	public A1() { }
}

public class A2{
	private static final int i;
	private void doStuff() { }
}

class A4{ 							//problemli tanimlama
	protected static final int num; // final dedigimiz zaman bir degiskene mutlaka deger de atamamiz gerekiyor.
	private void doStuff() {}
}

final abstract class A5{ // final ile abstract bir arada olmaz
	protected static int i;
	void doStuff() {}
	abstract void dolt();
	
}