package certifica51_100;

public class Q82 {
//	
//public class Employee {
	String name;
	boolean contract;
	double salary;
	
	Q82(){
		//line n1
		
	//	cevap2
//		this.name=new String("Joe");
//		this.contract=true;
//		this.salary=100;
		
		//yanlis cevap
		//	name="Joe";
		//	contract=TRUE;// bu da oluyor ama true yanlis yazilmis
		//	salary=100.0f;
	}
	public String toString() {
		return name+":"+contract+";"+salary;
	}
	public static void main(String[] args) {
		Q82 e=new Q82();
		//line2
		
		//cevap1
		e.name="Joe";
		e.contract=true;
		e.salary=100;
		
	//	System.out.println(e);
		System.out.println(e.toString()); // ?? buraya method cagirmak gerekmiyor mu???
	}
}
	

