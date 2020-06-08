package certifica51_100;

public class Q65 {
	int x;
	int y;
	public void doStuff(int x, int y) {
		x=x;
		y=this.y; // m2 de degerler bu yolla atanirken bu noktada y nin ilk degeri (this.y) 0 , y=this.y olunca y ye 0 atanmis oluyor. 
	}
	
	public void display() {
		System.out.print(x+" "+y+" : ");
	}
	public static void main(String[] args) {
		Q65 m1= new Q65();
		m1.x=100;
		m1.y=200;
		
		Q65 m2= new Q65();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
	}
}


	
	
	
