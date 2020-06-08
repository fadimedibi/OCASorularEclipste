package certifica1_50;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class q11 {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2014, 6, 20);// of metoduyla date-lerin yazilis formati bu sekilde  
		LocalDate date3=LocalDate.parse("2014-04-20", DateTimeFormatter.ISO_DATE);// parse metoduyda date lerin yazilisi bu sekilde
		System.out.println("date1= "+ date1);						// ISO_DATE_TIME olunca saati de veriyor. eger TIME yoksa 
		System.out.println("date2= "+ date2);						//	soruda saat olsa bile sonucta olmaz.
		System.out.println("date3= "+ date3);

	}

}
