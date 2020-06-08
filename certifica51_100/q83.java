package certifica51_100;

public class q83 {
	public static void main(String[] args) {
		Book1 book1=new EBook1();
		book1.readBook();
	}
}

interface Downloadable{
	public void download();
}

interface Readable1 extends Downloadable{	//linen1
	public void readBook();
}

abstract class Book1 implements Readable1{	//line n2
	private static int i;
	public void readBook() {
		System.out.println("Read Book");
	}
	public class Book1() {
		
	}
}

class EBook1 extends Book1{					//line n3
	public void readBook() {
		System.out.println("Read E-Book");
	}

//	@Override
//	public void download() {
//		// TODO Auto-generated method stub
//		
//	}
	
// cevap-->complation fails
// ???-->ancak bu sekliylede degeri consolda basiyor???
	
}


	
}