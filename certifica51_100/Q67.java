package certifica51_100;

public class Q67 {

	public static void main(String[] args) {
	//	int x=3; int y=5;		// x ve y tanimlanmis ama hermanhi bir islem yapilmamis uzerinda
		Test obj=new Test(3,5); // obj olusturulmus ancak herhengi bir method ile x ve y bu obj initialize edilmemis
		
	//	System.out.println(x+ " "+ y);
		System.out.println(obj.x+" "+obj.y);
		
		//System.out.println(x+" "+y);  //burda cagirilan x ve y yukarda tanimlanan.

	}

}
class Test {
	int x,y;
	public Test(int x,int y) {
		initialize(x,y);  
	}
	public void initialize(int x,int y) {
		this.x=x*x;
		this.y=y*y;
	}
}

// what is the result?