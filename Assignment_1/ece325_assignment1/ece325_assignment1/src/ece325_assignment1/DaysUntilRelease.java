package ece325_assignment1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class DaysUntilRelease {
	
	/**
	 * 	Calculate the number of days until releaseDate.
	 * @param releaseDate in the format yyyy-mm-dd (e.g., 2021-09-09)
	 * @return
	 * @throws ParseException 
	 */
	int calculateDaysUntilRelease(String releaseDate) throws ParseException{
		
		/* calculateDaysUntilRelease func takes a String (releaseDate) as an input
		 * create a string variable called todaydate
		 * call an inbuild  class(probabably calender) to get todaydate
		 * store it in today date
		 * int x = release date - today date
		 * if x is negative print (....)
		 * if x is positive print(....)
		 */
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date releaseDate1 = format.parse(releaseDate);  
		
		Date todayDate = new Date();
		long resultMiliSec = releaseDate1.getTime()-todayDate.getTime();
		int resultInt =(int)(resultMiliSec/(1000*60*60*24));  
		return resultInt;
				
		
	}
	
	public static void main(String[] args) throws ParseException {
		// A sample test case, also think of other test cases yourself
		// You can assume the date string is always in the correct format
		//We are now trying a past relase date
		//String releaseDate = "2020-10-15";
		//We are now trying a future relase date
		String releaseDate = "2023-10-15";
		
		
		DaysUntilRelease Fahrin = new DaysUntilRelease();
		int result = Fahrin.calculateDaysUntilRelease(releaseDate);
		
//		System.out.println(result);
		
		if(result<0) {
			System.out.println("Album was already released!");
		}
		else{
			System.out.println("Release will be in " + result + " days");
		}
		
		// Implementation based on whether calculateDaysUntilRelease is static or not, 
		// Replace xxxx with the correct instance/class name
		// int daysLeft = xxxx.calculateDaysUntilRelease(releaseDate);
	}
}

