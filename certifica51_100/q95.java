package certifica51_100;

public class q95 {

}

class Vehicle1{
	String type="4W";
	int maxSpeed=100;
	Vehicle1() {}
//	Vehicle1(String aaa) {}
	
	
	Vehicle1(String type, int maxSpeed) {
//	super();
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}
class Car1 extends Vehicle1{
	String ddd;
	Car1(String ddd){
//	super(aaa);
	//	this.ddd=ddd;
	
	}
	
	Car1(String type, int maxSpeed,String ddd) {
		super(type, maxSpeed);
	//	this(ddd);
	
	}

	
}