package certifica1_50;

import certifica51_100.Employee;

public class Q37 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Manager manager=new Manager();
		Director director=new Director();
		//line n1
		employee.salary=50_000;
		director.salary=80_000;// ust class lar gorulebilir alt classlar gorulemez.
		employee.budget=200_000;//employee alttaki (child classtaki)budget i goremez
		manager.budget=1_000_000;
		manager.stockOption=500; // maneger child classtaki budget i goremez
		director.stockOption=1_000;
	}

}
class Employee{
	public int salary;
}

class Manager extends Employee{
	public int budget;
}

class Director extends Manager{
	public int stockOption;
}