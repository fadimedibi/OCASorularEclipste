package certifica1_50;

public class Q44 {

	public static void main(String[] args) {
		String stuff="TV";
		String res=null;
		
//		if(stuff.equals("TV")) {
//			res="Walter";
//		}else if (stuff.equals("Movie")) {
//			res="White";
//		}else {
//			res="No Result";
//		}
		
		res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"no Result";  // ==>cevap
		
		System.out.println(res);
	}
}

// which code fragment can replace the if block?