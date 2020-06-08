package certifica101_144;

import java.util.ArrayList;
import java.util.List;

public class Qs117 {

	public static void main(String[] args) {
		ArrayList<Patient> ps = new ArrayList();
		
		Patient p =new Patient ("Mike");
		ps.add(p);
		int f = ps.indexOf(p);
		
		
		if(f>=0) {
			System.out.println("Mike Found");
		}
	
		
	

	}

}

class Patient{
	String name;
	public Patient(String name) {
		this.name= name;
	}
}
