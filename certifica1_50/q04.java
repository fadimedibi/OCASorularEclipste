package certifica1_50;

public class q04 {

	public static void main(String[] args) {
		
		int numbers[]= {12,13,42,32,15,156,23,51,12};
		int max=findMax(numbers);
	}

	// line n1 ==> which method signature do  you see at this line?==> static int findMax(int[] numbers)
	
	static int findMax (int [] numbers){	//return type int olduguna gore int olacak.
		int max=0;						// yukarda numbers icin kullanilmis numbers int array olduguna gore parametre in[] olacak
	// code goes here				// yukarida static bir feild de kullanilacagina gore static olmali
		return max;						// zaten ayni classtalar public olmasina gerek yok
	}
}


    // diger secenekler (dogru olmayanlar)
//   public int findMax (int [] numbers)
// 	 static int[] findMax (int max)
//   final int findMax (int [] )