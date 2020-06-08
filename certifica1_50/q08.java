package certifica1_50;

public class q08 {

	public static void main(String[] args) {
		CheckingAccount acct=new CheckingAccount ((int)(Math.random()*1000));// burdaki turunde bir constructor olmasi gerekili
	
//		this.amount = 0;   // needs constructor
//		amount = 0;		// need a variable named amout
//		acct (0) ;		// undefined method
//		acct.amount = 0;  // WORKS
//		acct. getAmount () = 0;  //method is assigned a number
//		acct.changeAmount(0); // randomly verilen bir sayiya 0 ekliyor o kadar
//		acct.changeAmount(-acct.amount);  // WORKS randomly verilen sayidan ayni sayiyi cikariyor.
//		acct.changeAmount(-acct.getAmount()); WORKS getamount metoauyla alinan sayinin negative ini positive ile topluyor
		
	
	
		
//		acct.setAmount(0);
//		acct.amount=0;  // burada amount degerine direkt 0 atandigindan sonuc 0 oluyor

//		acct.changeAmount(-acct.amount);// burada rasgele olusan amount degeri kadar - deger int x yerine gonderilince amount-amount=0 oluyur
//		acct.changeAmount(-acct.getAmount());//ayni sekilde olusan amount negatifiyle toplaniyor.

// 		bu uc atamadan birini yapmayinca math.rondom ile aldigi rasgele bir sayiyi amount olarak atiyor		

		System.out.println(acct.getAmount());
	}
}

 class CheckingAccount{
	public int amount; //default value=0
	
	public CheckingAccount(int amount) { //****constructor
		this.amount=amount;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount=amount;
	}
	public void changeAmount(int x) {
		amount+=x;
	}
}