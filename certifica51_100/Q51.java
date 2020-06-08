package certifica51_100;

public class Q51 {

	public static void main(String[] args) {
		String shirt[][]=new String[2][2];
		shirt[0][0]="red";
		shirt[0][1]="blue";
		shirt[1][0]="small";
		shirt[1][1]="medium";
		
		// cevap
		for(int index=0; index<2;) {
			for(int i=0; i<2;) {
				System.out.print(shirt[index][i]+":");
				i++;
			}
			index++;
		}
		System.out.println();
		 for(String [] c : shirt){
	            for (String s : c){
	                System.out.print(s+":");
	            }
	        }
		System.out.println(); 
		 // geriden yazdirmak icin medium:small:blue:red:
		 for(int index=1; index>=0;) {
				for(int i=1; i>=0;) {
					System.out.print(shirt[index][i]+":");
					i--;
				}
				index--;
			}
		 System.out.println();
		 // medium:blue:small:red:
		 for(int index=1; index>=0;) {
				for(int i=1; i>=0;) {
					System.out.print(shirt[i][index]+":");
					i--;
				}
				index--;
			}
		
	}
}

// which code fragment prints red:blue:small:medium?