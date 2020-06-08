package certifica101_144;

public class qs122 {

	public static void main(String[] args) {
		Float flt=100F;
		
		
		String[]strs=new String[2];
		int idx=0;
		for (String s:strs) {
			s.concat(" element "+idx);
			idx++;
		}
		for (idx=0; idx<strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
