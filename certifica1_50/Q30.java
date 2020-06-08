package certifica1_50;

public class Q30 {

	public static void main(String[] args) {
		int n [][]= {{1,3},{2,4,6}};
		System.out.println(n.length);
		//            2-1
		for (int i = n.length-1 ;  i>=0 ; i--) {// reversing and it will loop 2 times
			
			for(int y:n[i]) {			// enhanced loop and gets rows
				
				System.out.print(y);//24 i=1
				                    //13 i=0
			}		
				
			// boyle olsaydi 6 4 2 3 1 cikarirdi	
//		for (int j = n[i].length-1; j>=0; j--) {
//			System.out.println(n[i][j]);
//			System.out.println();
//		}		
				
		
		}
	}

}
