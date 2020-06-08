package certifica51_100;

public class Q81 {

	public static void main(String[] args) {
		String[]arr= {"A","B","C","D"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
			
			if(arr[i].equals("C")) {
				continue;
			}
			
			System.out.println("Work Done"); // eger bu for blogunun icinde olmasaydi durum farkli olurdu.
			break; 	// A Work done der- break den cikar.
		}
		
	}
}
