package certifica1_50;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q07 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		dt.plusDays(30);// burdaki metodlarin sonuclari bir degiskene atanmadigi surece bir degisiklik
						// yaratamaz.
		dt.plusMonths(1);// cunku local date de String gibi immutable dir.

		System.out.println(dt.format(DateTimeFormatter.ISO_DATE)); // cvp: 2014-07-13

		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME)); // boyle olsa cvp: 2014-07-31T01:01:00
		System.out.println(" dt : "+ dt);
		
		// LocalDate yaziyorsa sadece yil -ay-gun yazabiliyoruz. saat vs yazamiyoruz ve
		// ISO_DATE_TIME sonucu alamiyoruz
		// LocalDate dt_ =LocalDate.of(2014,7,13, 1, 1); bu sekilde hata veriyor
		// System.out.println(dt_.format(DateTimeFormatter.ISO_DATE_TIME)); hata veriyor
		// bir de YIL -AY - GUN seklinde formati var

		// Asagidaki sekilde code calisiyor
		LocalDate dt_ = LocalDate.of(2014, 7, 30);
		dt_.plusDays(30);
		dt_.plusMonths(1);
		System.out.println(dt_.format(DateTimeFormatter.ISO_DATE));

		// second Version:
		LocalDate date1 = LocalDate.now();  //2014-06-20
		LocalDate date2 = LocalDate.of(2014, 6, 20);	//2014-06-20
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("date3 = " + date3);

		// Assume that the system date is June 20,2014. What is the result?

//		    Answer:
//			date1= 2014-06-20
//			date2 = 2014-06-20
//			date3 =2014-06-20
	}

}

// of methodu ==> LocalDateTime.of(2014, 7, 31, 1, 1) bu sekilde yazilir sonuc 2014-07-31 bu formatta doner
// bir de parse metodu var o da String halindeki tarihi donusturuyor.
