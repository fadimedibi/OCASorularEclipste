package certifica51_100;

public class Q52 {

}

abstract class Planet{
	protected void revolve() { }
	
	abstract void rotate();// abstract metodlara otomatik public ekleniyor
}

class Earth extends Planet{
	public void revolve() { } // bu method ya public ya da protected olmak zorunda 
	protected void rotate() {	}
}