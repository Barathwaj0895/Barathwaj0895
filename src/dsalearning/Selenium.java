package dsalearning;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;

public class Selenium {
/**
 * @param addMonth
 * @return
 */
//public static String addMonthToDate (String addMonth) {
//	Calendar cal = Calendar.getInstance();
//	int addMonthInt = Integer.parseInt(addMonth);
//	cal.add(Calendar.MONTH, (1 + addMonthInt));
//	cal.set(Calendar.DAY_OF_MONTH, 1);
//	SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/YYYY");
//	Date date = cal.getTime();
//	String date1 = format1.format(date);
//	return date1;
//}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		test(10);
//		test(new Integer(10));
//		test((Integer)null);
//		System.out.println(factorial(5));
//		foo();
		Integer i = null;
		method(i);
	}
	
	public static void method(int k) {
//		if (n==1) return 1;
//		return n*factorial(n-1);
//		throw new RuntimeException();
		System.out.println(k);
	}
}
