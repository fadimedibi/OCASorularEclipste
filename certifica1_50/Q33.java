package certifica1_50;

import java.util.ArrayList;
import java.util.List;

public class Q33 {

	public static void main(String[] args) {
		List<String>names=new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if (names.remove("Bran")){ //remove metodu sadece ilk rasladigi degiskeni kaldiriyor. sonrakilere etki etmiyor
			names.remove("Jon");// burasi anlamsiz cunku list de Jon yok
		}
		System.out.println(names);	
	}

}
