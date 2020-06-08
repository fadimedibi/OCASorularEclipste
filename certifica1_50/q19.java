package certifica1_50;

public class q19 {

	private char var;

	public static void main(String[] args) {

		char var1 = 'a';	// var1= 'a'
		char var2 = var1;	// var2= 'a'
		var2 = 'e'; 		// var2='e' son durum var2

		q19 obj1 = new q19();// class ismi sorularda Vowel
		q19 obj2 = obj1; // they have same place in memory so they are same

		obj1.var = 'i';
		obj2.var = 'o';
		// a e
		System.out.println(var1 + ", " + var2);
		// o o >>>>>because obj and obj2 are same
		System.out.println(obj1.var + ", " + obj2.var);

	}
}
