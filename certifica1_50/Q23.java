package certifica1_50;

public class Q23 {

	public static void main(String[] args) {
		Person2 p1=new Person2("Jasse");
		Person2 p2=new Person2("Walter", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}

class Person2{
	String name;
	int age;
	
	public Person2(String name) {
		//this();		//==>there is no construtor without argument so we can not call
		//setName(name);
		this("zeynep", 5);
	
		
	}
	
	public Person2(String name, int age) {
		
		//Person2 (name);	//==>we can not call constructor by name ,can call by this()  in current class this(name);
		//setAge(age);
		this.name=name;
		this.age=age;
	}
	
	// setter and getter methods go here
	
	public String show() {
		return name+" "+age;
	}
	
}