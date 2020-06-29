package gitTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTime05_Formatter {
	public static void main(String[] args) {

		LocalDateTime today = LocalDateTime.now();
		System.out.println("toString() => " + today);

		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-M-d");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-MM-d, H:m:s");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");

		System.out.println(today.format(fm1));
		System.out.println(today.format(fm2));
		System.out.println(today.format(fm3));
	}
}