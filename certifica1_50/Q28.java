package certifica1_50;

public class Q28 {

	public static void main(String[] args) {
		String ta="A ";
		ta=ta.concat("B ");//AB
		String tb="C ";//C
		ta=ta.concat(tb);//ABC
		ta.replace('C', 'D');// it does not effect ta=ABC
							 // STRING IS IMMUTABLE  String ta=ta.replace('C', 'D');
		ta=ta.concat(tb);//ABCC
		System.out.println(ta);
	}
}
