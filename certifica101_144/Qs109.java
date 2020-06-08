package certifica101_144;

public class Qs109 {

	public static void main(String[] args) {
		DVD dvd=new DVD(10,20);
	}
}
class CD{
	int r;
	CD (int r){
		this.r=r;
	}
}

class DVD extends CD{
	int c;
	DVD (int r, int c){
		//line n1
		//super(r);  //==>cevap
		//this.c=c;  //==>cevap
	}
}

// which code fragment should you use at line n1 to instantiate the dvd object successfully/