package certifica1_50;

public class Q27 {
	public static void main(String[] args) {
		
		Product1 p1=new Product1(101, "Pen");
		Product1 p2=new Product1(101, "Pen");
		//Product1 p3=new Product1(101, "Pen");
		Product1  p3=p1;  // p1 ile ayni obj i gosteriyor
		       //      false
		//p1=p2;
		boolean ans1= p1==p2; // they have same parameters but they are different objects
		//               Pen        Pen
		boolean ans2=p1.name.equals(p2.name); // true
		

		System.out.println(ans1+" ; "+ans2);
		
	//	boolean ans3=p1==p3; System.out.println(ans3); // true
	//	boolean ans4 = p1.id==p2.id; System.out.println(ans4); //true
		
		
	}
}

class Product1{
	int id;
	String name;
	
	public Product1(int id, String name) {
		this.id=id;
		this.name=name;
	}
}