package certifica1_50;

public class q03 {

	public static void main(String[] args) {
		Person p1=new Person("Jesse");
		Person p2=new Person("Walter",52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}
class Person{
	String name;
	int age=25;
	
	
		
// ******constructorlar  boyle olusturulur.	 << Dogru code>>
//	public Person(String name) {
//		super();
//		this.name = name;
//	}
//	public Person(String name, int age) {
//		this(name);
//		this.age = age;
//	}
		
	

	public Person(String name) {
		this();					//line n1
		setName(name);
	}
	public Person(String name,int age) {
		Person(name);			// line n2
		setAge(age);
	}
	
	
	// setter and getter methods go here
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//////
	
	public String show() {
		return name+" "+age+" "+number;// number tanimlanmamis nerden gelmis belli degil
	}
	
	
	
	
}