package certifica51_100;

import java.io.IOException;

public class Q94 {

	public static void main(String[] args) throws Exception {
		X xobj=new X();
		xobj.printFileContenet();
	}
}

class X{
	public void printFileContenet() throws IOException {
		/* code goes here*/
		throw new IOException();
	}
}