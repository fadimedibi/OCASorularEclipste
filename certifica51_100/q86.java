package certifica51_100;

import certifica1_50.Book;
import certifica1_50.Readable;

public class q86 {

}

interface Readable{
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable{	// line n1
	public void readBook() { }
	// line n2
}

class EBook extends Book{					// line n3
	public void readBook() { }
	//line n4
	
	// insert public void setBookMark(){ }
}