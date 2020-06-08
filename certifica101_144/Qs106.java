package certifica101_144;

public class Qs106 {

	public static void main(String[] args) {
		Student[] students=new Student[3];
		students[1]=new Student("Richard");
		students[0]=new Student("Donald");
		for(Student s:students) {
			System.out.println(" "+s.name); // index[0] null ve biz onunla name cagiriyoruz==>nullPointException
			// System.out.println(" "+s);	// bu sekilde cagirilsa exception almaz ancak cagirilanlar obj oldugundan hashcode gelir
		}
	}
	
}

class Student{
	String name;
	public Student(String name) {
		this.name=name;
	}
}