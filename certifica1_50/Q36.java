package certifica1_50;

public class Q36 {

}
class Rectangle{
	private double length;
	private double height;
	private double area;
	
	public void setLength(double length) {
		this.length = length;
		//	setArea();
	}
	
	public void setHeight(double height) {
		this.height = height;
		//	setArea();
	}
	
	public void setArea() {
		area=height*length;
	}
	
	/*which two changes would encapsulate this class
	 *  and ensure that the area field is always equal to 
	 *  length*height whenever the Rectangle class used?
	 *  
	 *  answers
	 *  ==> call the setArea method at the END of the setHeight method.
	 *  ==> call the setArea method at the END of the setLenght method.
	 *  
	*/
	
	
	
}