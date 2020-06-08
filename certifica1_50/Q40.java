package certifica1_50;

import java.util.ArrayList;

public class Q40 {

	public static void main(String[] args) {
		ArrayList<String> myList=new ArrayList<>();
		String[]myArray;
		
		try {
			while(true) {
				myList.add("My String");
			}
		}catch(RuntimeException re) {
			System.out.println("Cought an Runtime Exception");
		}catch(Exception e) {
			System.out.println("Cought an Exception");
		}
		System.out.println("Ready to use");
	}
}
