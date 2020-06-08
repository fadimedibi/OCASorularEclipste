package certifica1_50;

public class q13 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(5);
		String s="";
		
//		String k=sb.toString();
//		System.out.println(k);      //bunlari bastirinca bos String cikiyor.
//		System.out.println("--");
//  	System.out.println(s);
//		System.out.println(sb);
		
		if (sb.equals(s)) { // iki farkli object i gosteriyorlar ayrica degiskenlerin turlari de farkli
			System.out.println("Match 1");
		}else if (sb.toString().equals(s.toString())) { // her ikisi de bos string  eger null olsalardi nullPointExeption verirdi
			System.out.println("Match 2");
		}else {
			System.out.println("No Match");
		}
		char c=65535;
		String[] b[]=new String [2][1];
		
		
		
		//first version
      StringBuilder sb1 = new StringBuilder("Java");
      String s1 = "Java";                           //object ile string i karsilastiramiyoruz. Karsilastirma yapmamiz icin toStiring kullanmamiz lazim
      System.out.println(sb1);
      if (sb1.toString().equals(s1.toString())){
          System.out.println("March 1");
      }else if(sb1.equals(s1)){
          System.out.println("March 2");
      }else {
          System.out.println("No Match");
      }
      
      
      
      
      
   // StringBuilder sb1 = new StringBuilder ("Duke");
   // String str1 = sb1.toString();
   //// 9. // insert code here
   // // String str2=str1;
   // System.out.print(str1 == str2);

   /*
   Which code fragment, when inserted at line 9, enables the code to print true?

   A. String str2=str1;
   B. String str2 = new String(str1);
   C. String str2 = sb1.toString();
   D. String str2 = "Duke";

   Answer:A
    */

   // 2nd version hersey aynu sadece Duke yerine Java yazilmis

   // StringBuilder sb1 = new StringBuilder ("Java");
   // String str1 = sb1.toString();
   //// 9. // insert code here
   //
   // System.out.print(str1 == str2);

   /*
   Which code fragment, when inserted at line 9, enables the code to print true?

   A. String str2=str1;
   B. String str2 = new String(str1);
   C. String str2 = sb1.toString();
   D. String str2 = "Java";


    */
	}
}
