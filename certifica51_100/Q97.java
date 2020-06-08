package certifica51_100;

public class Q97 {
	public static void main(String[] args) {
		WindAnimal wolf=new WindAnimal("Long");
		WindAnimal tiger=new WindAnimal("Feline",80,"Short");
		System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
		System.out.println(tiger.type+" "+tiger.maxSpeed+" "+tiger.bounds);
	}
}

class Animal{
	String type="Canine";
	int maxSpeed=60;
	
	Animal(){}

	Animal(String type, int maxSpeed) {
	//	super();
		this.type = type;
		this.maxSpeed = maxSpeed;
	}	
}
class WindAnimal extends Animal{
	String bounds;

	WindAnimal(String bounds) {
//		super();					//line n1
		this.bounds = bounds;
	}

	WindAnimal(String type, int maxSpeed,String bounds) {
		super(type, maxSpeed);		// line n2
		this.bounds=bounds;
	}
	
}

//==> cevap-> line n2 ye gosterilenler eklenecek, n1 e bisey eknenmese de sorun yok.