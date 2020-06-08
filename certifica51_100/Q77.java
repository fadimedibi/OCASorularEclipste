package certifica51_100;

public class Q77 {
	static int i;// static degisken oldugundan son atanan deger butun obj ler icin gecerlidir.
	int j;
	
	public static void main(String[] args) {
		Q77 x1=new Q77();
		Q77 x2=new Q77();
		x1.i=3;//i=3
		x1.j=4;//4
		i=5;//5
		x2.j=6;//6
		                  //5         4       5       6
		System.out.println(x1.i+" "+x1.j+" "+x2.i+" "+x2.j);
	}
}
//what is the result?