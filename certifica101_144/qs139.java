package certifica101_144;

public class qs139 {

	static double area;
	static int b = 2;
	static int h = 3;

	public static void main(String[] args) {
//		double p,b,h;
//		
//		if(area == 0) {
//			b=3;
//			h=4;
//			p=0.5;
//			area=p*b*h;
//		}
//	
//		System.out.println("Area : "+ area);

		String[] day = { "sun", "mon", "wed", "sat" };
		int i = 0;
		for (String a : day) {
			switch (a) {
			case "sat":
			case "sun":
				i -= 1;
				break;
			case "mon":
				i++;
			case "wed":
				i += 2;
			}

		}
		System.out.println(i);

	}
}
