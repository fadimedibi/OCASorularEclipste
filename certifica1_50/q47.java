package certifica1_50;

interface Readable{

	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable{ // line n1
	public void readBook() { }
	//line n2
//	public abstract void setBookMark();  bunu ekleyince hala hata veriyor EBook class ta
}

class EBook extends Book{		//line n3
	public void readBook() { }
	//line n4
	public void setBookMark() { }//==> cevap -- bu eklenince sorun kalmiyor.
}

class Test1{
	public static void main(String[] args) {
		Book book1=new EBook();
		book1.readBook();
	}
}