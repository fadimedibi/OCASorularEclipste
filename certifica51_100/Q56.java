package certifica51_100;

public class Q56 {

	public static void main(String[] args) {
		int[]stack= {10,20,30};
		int size=3;
		int idx=0;
		// line n1
		
		//System.out.println("The top element: "+stack[idx]);// bu durumda top element 10
		// line 1 ne eklenirse top element 30 olur?
		
		do {					//dogru cevap bu
			idx++;  //idx=1  -- 2
		}while(idx<size-1); //1<2 ----2<2
				
		//while(idx<size) {	//idx en son 2 olduktan sonra bir arttigindan syso da 3 oluyor outOfBounds oluyor
		//	idx++;			// size-1 olsaydi olurdu.
		//}
		
		//while(idx<size-1) { // bu olurdu ancak
		//	idx++			// burda ; eksik
		//}
		
		System.out.println("The top element: "+stack[idx]);
	}
}
