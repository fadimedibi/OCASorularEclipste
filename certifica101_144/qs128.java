package certifica101_144;

class Product{
	double price;
}

public class qs128 {

	public void updatePrice(Product product,double price) {
		price=price*2;
		product.price=product.price+price;
	}

	public static void main(String[] args) {
		
		Product prt=new Product();
		prt.price=200;
		double newPrice=100;
		
		qs128 t=new qs128();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price+" ; "+newPrice);

//		int [] arr= {1,2,3,4,5};
//		int x=arr.length;
//		
//		while(x>0) {
//			x--;
//			System.out.println(arr[x]);
		}
	

}
