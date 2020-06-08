package certifica1_50;

public class Q35 {

	public static void main(String[] args) {
		int numbers[];
		numbers=new int[2];
		numbers[0]=10;
		numbers[1]=20;
		
		numbers=new int[4];  // array in size i bir kere declere edilir. ikinci olusturulan sey farkli bir array dir. 
		numbers[2]=30;		// isim ayni oldugundan birinciyi kullanilamaz hale getirir.
		numbers[3]=40;		// birinci array deki degerler ikinci array e kopyalanmaz!!
		
		for(int x:numbers) {
			System.out.println(" "+x);
		}
	}
}
