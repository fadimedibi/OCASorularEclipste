package certifica51_100;

public class Q89 {

	public static void main(String[] args) {
		Planet1 [] planets= {
				new Planet1("Mercury", 0),	//arrayin icerisine 4 obj yerlestirildi.
				new Planet1("Venus", 0),
				new Planet1("Earth", 1),
				new Planet1("Mars", 2) };
		
		
		System.out.println(planets);	//==> array bu sekilde yazdirilmaz loop kullanilmasi lazim bu sekilde hashcode basar
		System.out.println(planets[2]);	//==> arrayin index 2 si bu sekilde basbilirdi fakat bu indexte bir obj oldugundan obj lerle bisey cagirmadigin surece burda hashcode basar.
		System.out.println(planets[2].moons);	//==> burda sorun yok index 2 deki Earth in moon sayisi olan 1 basar.
		//new Planet1("Earth", 1),
	}
}

class Planet1{
	public String name;
	public int moons;
	
	public Planet1(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}
	public String toString() {
		return name+moons;
	}
	
}