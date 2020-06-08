package certifica51_100;

public class Qs100 {
	

		ElectricAccount acct=new ElectricAccount();
		public void useElectricity(double kWh) {// burdaki sorunun ne oldugunu anlayamadim soruda ayni sekilde yazilmis
			acct.addKWh(kWh);
		}
		public static void main(String[] args) {
			Qs100 obj = new Qs100();
			obj.useElectricity(10);
	}
}

class ElectricAccount{
	private double kWh;
	private double rate=0.07;
	private double bill;
	
	// line n1
	public void addKWh(double kWh) {
		if(kWh>0) {
			this.kWh+= kWh;
			//this.bill=this.kWh*this.rate;
			setBill(this.kWh);
		}
		
		System.out.println(bill);
	}
	public void setBill(double kWh) {
		bill=kWh*rate;
	}
	
	
}