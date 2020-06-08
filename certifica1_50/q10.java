package certifica1_50;

import java.util.ArrayList;
import java.util.List;

public class q10 {

	public static void main(String[] args) {
		List colors=new ArrayList();
		colors.add("green"); //0
		colors.add("red");	 //1
		colors.add("blue");	 //2 ==>index 2 remove ile cikarilir
		colors.add("yellow");//3 ==>bu index 2 olur
		colors.remove(2);
		colors.add(3,"cyan");// ==> bu durumda bu da bosalmis olan index 3 e hicbirsey silmeden eklenir.
		
		System.out.println(colors);
	
	}
}
