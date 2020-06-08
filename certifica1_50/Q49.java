package certifica1_50;

public class Q49 {
	
	String myStr="7007";
	public static void main(String[] args) {
	
		Q49 obj=new Q49();
		obj.doStuff("9009");

	}

	public void doStuff(String str) {
		int myNum=0;	// ==> myNum da doStuff metodunun blogu icinde kalir ama bu metod icinde veri basildigindan sorun yok
		try {
			String myStr=str;		//==> burda atanan myStr bu blogun icinde kalir cunku burda tanimlanmis
			 myNum=Integer.parseInt(myStr);
			
		}catch(NumberFormatException ne) {
			System.err.println("Error!!!");
		
		}
		System.out.println("myStr: "+myStr+", myNum: "+myNum);	
	}
}
// what is result?