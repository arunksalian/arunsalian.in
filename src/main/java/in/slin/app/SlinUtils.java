package in.slin.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SlinUtils {
	private static final String DATE_PATTERN = "YYYY_MM_DD";

	public static String getDateString (Date date) {
		DateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
		return dateFormat.format(date);
	}
	
	public static void main (String args[]) {
		Date date = new Date (System.currentTimeMillis());
		System.out.println(getDateString(date));
	}
}
