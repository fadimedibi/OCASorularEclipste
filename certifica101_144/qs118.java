package certifica101_144;

import java.util.ArrayList;

public class qs118 {
	
	public static void main(String[] args) {
		ArrayList points=new ArrayList();
		points.add(1);
		points.add(2);
		points.add(null);
		points.add(3);
		points.add(null);
		points.add(4);
		points.add(null);
		points.remove(2);
		points.remove(null);
		points.remove(null);
		points.add("Fadime");
//		points.remove(6);
	System.out.println(points.size());	
		System.out.println(points);
	}
}
