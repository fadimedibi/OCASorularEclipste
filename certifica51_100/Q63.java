package certifica51_100;

public class Q63 {

}

class MarkList{
	int num;
	public static void graceMarks(MarkList obj4) {
		obj4.num+=10;
	}
	
	public static void main(String[] args) {
		MarkList obj1= new MarkList(); 	//==> 1
		MarkList obj2=obj1;			   	//==> obj1 i gosteriyor yeni obj olusturulmadi
		MarkList obj3=null;				//==>null ; yeni obj olusturulmadi.
		obj2.num=60;
		graceMarks(obj2);
	}
}

// how many obj are created in memory at runtime?

// answer:1