package certifica101_144;

public class Qs102 {

	public static void main(String[] args) {
		CheckingAccount acct=new CheckingAccount();
		//line n2
		//acct.amount=100;
		System.out.println(acct.amount);
		
	}
}

class CheckingAccount{
	public int amount;
	//line n1
	public CheckingAccount() {
		amount=100;
	}
//		this.amount=100;
//	}
}

//which three pieces of code,when inserted independently, set the value of amount to 100/