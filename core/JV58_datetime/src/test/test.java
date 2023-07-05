package test;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Hàm lấy thời gian hiện tại
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println("TEST");
		}
		long t2 = System.currentTimeMillis();

		System.out.println("before run for: " + t1);
		System.out.println("after run for: " + t2);
		System.out.println("time: " + ((t2 - t1)) + "mls");
		System.out.println("time: " + ((t2 - t1) / 1000) + "s");

		// TimeUnit
		System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
//		ngay sang gio
		long Hours = TimeUnit.DAYS.toHours(3);
		System.out.println(Hours);

//		ngay sang giay

		long s = TimeUnit.DAYS.toSeconds(2);
		System.out.println(s);

		// Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d);
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

		// Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));

		c.add(Calendar.MONTH, 3);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));

		c.add(Calendar.DATE, 14);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));

		// DateFormat
		
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));

		df = new SimpleDateFormat("yyyy.MM.dd G 'at' hh:mm:ss z");
		System.out.println(df.format(d));

	}

}
