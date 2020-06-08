package certifica51_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q93 {
		static String s;
	public static void main(String[] args) {
		String [] arr = {"Hi","how","are","you"}; // burdaki parantez () degil {} olmali
		List <String>arrList=new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf((String s)->s.length()<=2)){
			System.out.println("removed"+s);
		}
	}
}

// bu soruda birsuru parantez ve yazim hatasi vardi duzeltebildigim son syntax hatasi olmayan hali bu
// cevap: compilation fails