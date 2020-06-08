package certifica1_50;

public class Q24 {

	public static void main(String[] args) {
		int data[]= {2010,2013,2014,2015,2014};
		int key=2014;
		int count=0;
		for(int e:data) {
			if(e!=key) {
				continue;
				count++;	// 
					// count++ is unreachable code because of continue ==>compilation fails.
			}
		}
		System.out.println(count+ "Found");
	}
}
