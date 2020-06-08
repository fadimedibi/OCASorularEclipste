package certifica1_50;

public class q17 {

	public static void main(String[] args) { // STRING IS IMMUTABLE
		String str = "  ";
		str.trim();// string is immutable and srt.trim() does not change
					// false false>>>>it is not empty space is a value for string
		System.out.println(str.equals("") + " " + str.isEmpty());
		// "" >>empty

	}
}
