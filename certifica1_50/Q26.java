 package certifica1_50;

public class Q26 {
	static int count=0;
	int i=0;
	
	public void changeCount() {
		while (i<5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Q26 check1=new Q26();
		Q26 check2=new Q26();
//		Q26 check3=new Q26();
//		Q26 check4=new Q26();
		
		
		check1.changeCount();// i=5, count=5
		check2.changeCount();// i=5, count=10--> count is static variable and the final value is 10 for count
//		check3.changeCount();
//		check4.changeCount();   
		
		System.out.println(check1.count+" : "+check2.count);
		
	}

}
