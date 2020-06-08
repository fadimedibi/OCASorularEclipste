package certifica51_100;

import java.io.IOException;

public class Q69 {

	public static void main(String[] args) throws IOException //throws IOException //-->cevap
	{
		X xobj=new X();
		xobj.printFileContent();
	}
}
 class X{
	public void printFileContent() throws IOException //throws IOException //--> cevap
	 {
		 /* code goes here*/
		 throw new IOException();
	 }
 }
 
 // Which two modification should you make so that the code compiles successfully?