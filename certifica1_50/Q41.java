package certifica1_50;

public class Q41 {
	
	public static void main(String[] args) {
		String opt="true";
		switch(opt) { //boolean type value switch de kullanilamaz-->int, string veya sayi iceren bir type olmali
		case "true":
			System.out.println("True");
			break;
		default:
			System.out.println("***");
		}
		System.out.println("Done");
	}
}

// Which modification enables the code fragment to print TrueDone?
// 
//answer--> replace line 6 with String opt="true", and Replace line 8 with case "true":
//