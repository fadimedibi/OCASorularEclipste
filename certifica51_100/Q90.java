package certifica51_100;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q90 {
	
	public static void checkAge(List<Person>list, Predicate<Person> predicate) {
		for(Person p:list) {
			if (predicate.test(p)) {
				System.out.println(p.name+" ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		List <Person> iList=Arrays.asList(new Person("Hank",45),
										new Person("Charlie",40),
										new Person("Smith",38));
		//line n1
		checkAge(iList,p->p.getAge()>40);//==> cevap

		
		//A) checkAge (iList, () -> p.get Age () > 40);  // () ici bos oldugu icin neye bakacagini bilemez sonraki cond icin
		//B) checkAge (iList, Person p -> p.getAge () > 40);  // Person p diye type i belirtemeyiz Lambda kendisi ne oldugunu bilir
		//C) checkAge (iList, p -> p.getAge () > 40);
		//D) checkAge (iList, {Person p} -> {p.getAge () > 40;});
//		checkAge(iList,(Person p) -> p.getAge() > 39);   bu code da calisir
	}
}

class Person{
	String name;
	int age;
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	
	
	
	
	
	
}